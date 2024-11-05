package shopping.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shopping.domain.*;

@Component
public class PointAccumulationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PointAccumulation>> {

    @Override
    public EntityModel<PointAccumulation> process(
        EntityModel<PointAccumulation> model
    ) {
        return model;
    }
}
