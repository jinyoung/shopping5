package shopping.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "usermgmt", url = "http://usermgmt:8080")
public interface UserService {
    @RequestMapping(method = RequestMethod.POST, path = "/users")
    public void createUser(@RequestBody User user);
}
