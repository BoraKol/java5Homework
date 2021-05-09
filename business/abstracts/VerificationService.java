
package javahomework5.business.abstracts;

import javahomework5.entities.concretes.User;


public interface VerificationService {
    void sendLinkToVerify(User user);
}
