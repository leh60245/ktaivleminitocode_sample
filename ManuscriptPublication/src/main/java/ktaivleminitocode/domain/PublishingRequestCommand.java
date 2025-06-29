package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PublishingRequestCommand {

    private AuthorId authorId;
    private String title;
    private String content;
    private ManuscriptType type;
}
