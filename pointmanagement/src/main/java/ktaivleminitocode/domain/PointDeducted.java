package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PointDeducted extends AbstractEvent {

    private Long userId;
    private Long subscriberId;
    private Integer amount;
    private Integer pointBalance;
    private String transactionType;
    private Date createdAt;
    private String name;
    private String email;
    private Boolean isKtUser;
    private Integer points;

    public PointDeducted(User aggregate) {
        super(aggregate);
    }

    public PointDeducted() {
        super();
    }
}
//>>> DDD / Domain Event
