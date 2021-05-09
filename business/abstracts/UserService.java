
package javahomework5.business.abstracts;

import java.util.List;
import javahomework5.entities.concretes.User;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User>getAll();
    void login(User user);
}
