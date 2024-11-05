package shopping.usermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication  // uncomment if this is main spring application
public class User {

    String name;
    Email email;
    Password password;
    String 주소;

    void UpdateUser() {}

    public static void main(String args[]) {
        SpringApplication.run(User.class, args);
    }
}
