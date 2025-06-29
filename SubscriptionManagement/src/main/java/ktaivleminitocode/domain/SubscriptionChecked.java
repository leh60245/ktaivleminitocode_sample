package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SubscriptionChecked extends AbstractEvent {

    private Long subscriptionId;
    private SubscriptionPlanType planType;
    private Date startDate;
    private Date endDate;
    private SubscriptionStatus status;
    private Long subscriberId;
    private SubscriptionStatus subscriptionStatus;

    public SubscriptionChecked(Subscription aggregate) {
        super(aggregate);
    }

    public SubscriptionChecked() {
        super();
    }
}
//>>> DDD / Domain Event
