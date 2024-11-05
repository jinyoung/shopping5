package shopping.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//<<< Resilency / Circuit Breaker
@FeignClient(name = "point", url = "${api.url.point}")
public interface PointAccumulationService {
    @RequestMapping(method = RequestMethod.POST, path = "/pointAccumulations")
    public void accumulatePoints(
        @RequestBody PointAccumulation pointAccumulation
    );
}
//>>> Resilency / Circuit Breaker
