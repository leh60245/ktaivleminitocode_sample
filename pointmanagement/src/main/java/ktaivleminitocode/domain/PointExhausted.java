package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PointExhausted extends AbstractEvent {

    private Long userId;
    private Long subscriberId;
    private Integer pointBalance;
    private Date exhaustedAt;
    private String name;
    private String email;
    private Boolean isKtUser;
    private Integer points;

    public PointExhausted(User aggregate) {
        super(aggregate);
    }

    public PointExhausted() {
        super();
    }
}
//>>> DDD / Domain Event
