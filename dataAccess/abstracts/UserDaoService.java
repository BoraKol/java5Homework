
package javahomework5.dataAccess.abstracts;

import java.util.List;
import javahomework5.entities.concretes.User;

public interface UserDaoService {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User>getAll();
}
