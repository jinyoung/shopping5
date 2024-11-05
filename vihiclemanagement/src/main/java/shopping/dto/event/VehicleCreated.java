package shopping.dto.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class VehicleCreated extends AbstractEvent {

    private String 차량번호;
    private String 차종;
    private String 연식;
    private String 배기량;

    public VehicleCreated() {
        super();
    }
}
