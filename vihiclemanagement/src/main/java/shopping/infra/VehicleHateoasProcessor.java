package shopping.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shopping.domain.*;

@Component
public class VehicleHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Vehicle>> {

    @Override
    public EntityModel<Vehicle> process(EntityModel<Vehicle> model) {
        return model;
    }
}
