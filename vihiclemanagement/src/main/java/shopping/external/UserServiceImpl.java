package shopping.external;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /**
     * Fallback
     */
    public User getUser(Long id) {
        User user = new User();
        return user;
    }
}
