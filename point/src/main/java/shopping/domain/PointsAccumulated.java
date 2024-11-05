package shopping.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointsAccumulated extends AbstractEvent {

    private String name;
    private Money points;

    public PointsAccumulated(PointAccumulation aggregate) {
        super(aggregate);
    }

    public PointsAccumulated() {
        super();
    }
}
//>>> DDD / Domain Event
