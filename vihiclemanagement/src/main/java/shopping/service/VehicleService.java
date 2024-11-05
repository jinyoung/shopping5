package shopping.service;

import java.util.List;
import shopping.dto.entity.Vehicle;

public interface VehicleService {
    public List<Vehicle> getList();

    public void save(Vehicle vehicle);

    public Vehicle getById(Long id);

    public void delete(Long id);

    public void update(Vehicle vehicle);
}
