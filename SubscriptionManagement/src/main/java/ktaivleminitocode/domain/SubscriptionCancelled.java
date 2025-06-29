package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SubscriptionCancelled extends AbstractEvent {

    private Long subscriberId;
    private SubscriptionPlanType planType;
    private Date cancelledAt;
    private String cancellationReason;
    private SubscriptionStatus status;

    public SubscriptionCancelled(Subscription aggregate) {
        super(aggregate);
    }

    public SubscriptionCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
