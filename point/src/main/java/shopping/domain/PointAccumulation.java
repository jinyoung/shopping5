package shopping.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Data;
import shopping.PointApplication;
import shopping.domain.PointsAccumulated;

@Entity
@Table(name = "PointAccumulation_table")
@Data
//<<< DDD / Aggregate Root
public class PointAccumulation {

    @Id
    private String name;

    private Money points;

    @PostPersist
    public void onPostPersist() {
        PointsAccumulated pointsAccumulated = new PointsAccumulated(this);
        pointsAccumulated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PointAccumulationRepository repository() {
        PointAccumulationRepository pointAccumulationRepository = PointApplication.applicationContext.getBean(
            PointAccumulationRepository.class
        );
        return pointAccumulationRepository;
    }
}
//>>> DDD / Aggregate Root
