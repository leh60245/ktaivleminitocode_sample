package ktaivleminitocode.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceReadBookCommand {

    private Long subscriberId;
    private Long bookId;
}
