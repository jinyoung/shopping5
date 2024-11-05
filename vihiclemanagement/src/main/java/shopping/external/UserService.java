package shopping.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//<<< Resilency / Circuit Breaker
@FeignClient(name = "usermgmt", url = "${api.url.usermgmt}")
public interface UserService {
    @RequestMapping(method = RequestMethod.POST, path = "/users")
    public void createUser(@RequestBody User user);
}
//>>> Resilency / Circuit Breaker
