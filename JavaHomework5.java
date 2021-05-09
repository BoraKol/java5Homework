
package javahomework5;

import java.util.List;
import javahomework5.business.abstracts.UserService;
import javahomework5.business.concretes.UserManager;
import javahomework5.core.abstracts.JGoogleLoggerService;
import javahomework5.core.concretes.JGoogleLoggerManagerAdapter;
import javahomework5.dataAccess.concretes.UserDao;
import javahomework5.entities.concretes.User;
import javahomework5.jGoogleLogger.JGoogleLoggerManager;


public class JavaHomework5 {

    public static void main(String[] args) {
       User user1=new User();
       user1.setFirstName("Bora");
       user1.setLastName("Kol");
       user1.setEmail("boraakol@gmail.com");
       user1.setPassword("123456");
       User user2=new User();
       user2.setFirstName("Tayfun");
       user2.setLastName(" Yılmaz");
       user2.setEmail("tayfunyilmaz55@gmail.com");
       user2.setPassword("abcdef");
       
       UserManager userManager=new UserManager(new UserDao(), new JGoogleLoggerManagerAdapter());
       userManager.add(user2);
       userManager.update(user2);
       userManager.delete(user2);
       JGoogleLoggerManagerAdapter jGoogleLoggerManagerAdapter=new JGoogleLoggerManagerAdapter();
       jGoogleLoggerManagerAdapter.logInWıthGoogle(user1);
       jGoogleLoggerManagerAdapter.logInWıthGoogle(user2);
       
       userManager.getAll();//ekran çıktısı vermiyor, hata da vermiyor.  
       userManager.login(user1);
       userManager.login(user2);
       
       
       
       
       
    }
    
}
