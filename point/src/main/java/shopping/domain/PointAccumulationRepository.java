package shopping.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopping.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "pointAccumulations",
    path = "pointAccumulations"
)
public interface PointAccumulationRepository
    extends JpaRepository<PointAccumulation, String> {}
