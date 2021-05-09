
package javahomework5.business.concretes;

import javahomework5.business.abstracts.VerificationService;
import javahomework5.entities.concretes.User;

public class VerificationManager implements VerificationService{

    @Override
    public void sendLinkToVerify(User user) {
        System.out.println("Doğrulama linkine tıklayarak üyelik işleminizi tamamlayabilirsiniz.");
    }
   
}
