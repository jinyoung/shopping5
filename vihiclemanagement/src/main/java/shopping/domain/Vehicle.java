package shopping.domain;

import shopping.domain.VehicleCreated;
import shopping.VihiclemanagementApplication;
import jakarta.persistence.*;
import java.util.List;


import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Vehicle_table")
@Data

//<<< DDD / Aggregate Root
public class Vehicle  {


    
    @Id
    
    
    
    
    
    private Value Object Type 차종;
    
    
    
    
    private Value Object Type 연식;
    
    
    
    
    private Value Object Type 배기량;
    
    
    
    @ElementCollection
    private List<> maintenanceHistories;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        shopping.external.PointAccumulation pointAccumulation = new shopping.external.PointAccumulation();
        // mappings goes here
        VihiclemanagementApplication.applicationContext.getBean(shopping.external.PointAccumulationService.class)
            .accumulatePoints(pointAccumulation);


        VehicleCreated vehicleCreated = new VehicleCreated(this);
        vehicleCreated.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
    }

    public static VehicleRepository repository(){
        VehicleRepository vehicleRepository = VihiclemanagementApplication.applicationContext.getBean(VehicleRepository.class);
        return vehicleRepository;
    }






}
//>>> DDD / Aggregate Root
