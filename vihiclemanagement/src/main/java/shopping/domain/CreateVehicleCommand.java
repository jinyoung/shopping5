package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateVehicleCommand {

    private String 차량번호;
    private String 차종;
    private String 연식;
    private String 배기량;
}
