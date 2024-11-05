package shopping.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shopping.dto.entity.Vehicle;
import shopping.mapper.VehicleMapper;
import shopping.service.VehicleService;

@Transactional
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleMapper vehicleMapper;

    @Override
    public List<Vehicle> getList() {
        List<Vehicle> vehicleList = vehicleMapper.findList();

        return vehicleList;
    }

    @Override
    public void save(Vehicle vehicle) {
        vehicleMapper.save(vehicle);

        // PUB/SUB
        // if trigger is set as Post~, this line should go below save method
        // VehicleCreated vehicleCreated = new VehicleCreated();
        // BeanUtils.copyProperties(vehicle, vehicleCreated);
        // vehicleCreated.publish(vehicleCreated.getId());

        // Req/Res
        // Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        shopping.external.PointAccumulation pointAccumulation = new shopping.external.PointAccumulation();
        // mappings goes here
        Application.applicationContext
            .getBean(shopping.external.PointAccumulationService.class)
            .accumulatePoints(pointAccumulation);
    }

    @Override
    public Vehicle getById(Long id) {
        Vehicle vehicle = vehicleMapper.findOneById(id);

        return vehicle;
    }

    @Override
    public void delete(Long id) {
        vehicleMapper.deleteById(id);
    }

    @Override
    public void update(Vehicle vehicle) {
        vehicleMapper.update(vehicle);
    }
}
