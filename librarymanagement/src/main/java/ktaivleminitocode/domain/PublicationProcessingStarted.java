package ktaivleminitocode.domain;

import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class PublicationProcessingStarted extends AbstractEvent {

    private Long publicationRequestId;
    private Object status;
    private Date updatedDate;
    private String coverImageUrl;
    private String authorid;
}
