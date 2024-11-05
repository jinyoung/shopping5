package shopping.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AccumulatePointsCommand {

    @Id
    private String name;

    @Id
    private Money points;
}
