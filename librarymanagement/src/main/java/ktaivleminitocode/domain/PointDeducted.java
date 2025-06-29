package ktaivleminitocode.domain;

import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

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
}
