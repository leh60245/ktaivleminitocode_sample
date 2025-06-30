package ktaivleminitocode.domain;

import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class ReadBookPlaced extends AbstractEvent {

    private Long userId;
    private Long bookId;
}
