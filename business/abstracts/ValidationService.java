
package javahomework5.business.abstracts;

import javahomework5.entities.concretes.User;

public interface ValidationService {
    boolean checkFirstNameLength(User user);
    boolean checkLastNameLength(User user);
    boolean checkEmailFormat(User user);
    boolean checkThePassword(User user);
}
