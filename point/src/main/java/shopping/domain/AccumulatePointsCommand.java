package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AccumulatePointsCommand {

    private String name;
    private Money points;
}
