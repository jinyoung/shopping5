package shopping.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateUserCommand {

    @Id
    private String name;

    @Id
    private Email email;

    @Id
    private Password password;
}
