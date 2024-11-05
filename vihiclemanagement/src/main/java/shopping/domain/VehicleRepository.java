package shopping.domain;

import shopping.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="vehicles", path="vehicles")
public interface VehicleRepository extends JpaRepository<Vehicle, Value Object Type>{
}