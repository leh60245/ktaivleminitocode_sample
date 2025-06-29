package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReadBookPlaced extends AbstractEvent {

    private Long userId;
    private Long subscriverId;
    private Long bookId;
    private String name;
    private String email;
    private Boolean isKtUser;
    private Integer points;

    public ReadBookPlaced(User aggregate) {
        super(aggregate);
    }

    public ReadBookPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
