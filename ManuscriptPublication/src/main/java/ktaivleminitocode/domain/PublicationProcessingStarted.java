package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import ktaivleminitocode.domain.*;
import ktaivleminitocode.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PublicationProcessingStarted extends AbstractEvent {

    private Long publicationRequestId;
    private PublicationRequestStatus status;
    private Date updatedDate;
    private String coverImageUrl;
    private String authorid;

    public PublicationProcessingStarted(PublicationRequest aggregate) {
        super(aggregate);
    }

    public PublicationProcessingStarted() {
        super();
    }
}
//>>> DDD / Domain Event
