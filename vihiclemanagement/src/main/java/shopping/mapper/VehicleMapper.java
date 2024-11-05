package shopping.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import shopping.dto.entity.Vehicle;

@Mapper
public interface VehicleMapper {
    public List<Vehicle> findList();

    public Vehicle findOneById(Long id);

    public void save(Vehicle vehicle);

    public void update(Vehicle vehicle);

    public void deleteById(Long id);
}
