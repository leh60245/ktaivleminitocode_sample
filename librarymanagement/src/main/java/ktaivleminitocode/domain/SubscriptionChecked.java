package ktaivleminitocode.domain;

import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class SubscriptionChecked extends AbstractEvent {

    private Long subscriptionId;
    private Object planType;
    private Date startDate;
    private Date endDate;
    private Object status;
    private Long subscriberId;
    private Object subscriptionStatus;
}
