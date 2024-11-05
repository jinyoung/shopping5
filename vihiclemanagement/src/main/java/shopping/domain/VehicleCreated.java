package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class VehicleCreated extends AbstractEvent {

    private String 차량번호;
    private String 차종;
    private String 연식;
    private String 배기량;

    public VehicleCreated(Vehicle aggregate) {
        super(aggregate);
    }

    public VehicleCreated() {
        super();
    }
}
//>>> DDD / Domain Event
