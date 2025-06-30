package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SubscriptionDeactivated extends AbstractEvent {

    private Long subscriberId;
    private SubscriptionPlanType planType;
    private Date deactivatedAt;
    private SubscriptionStatus status;

    public SubscriptionDeactivated(Subscription aggregate) {
        super(aggregate);
    }

    public SubscriptionDeactivated() {
        super();
    }
}
//>>> DDD / Domain Event
