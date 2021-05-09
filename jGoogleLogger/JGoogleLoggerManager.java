
package javahomework5.jGoogleLogger;

import javahomework5.entities.concretes.User;

public class JGoogleLoggerManager {
   
        public void LogInWithGoogle(User user){
            System.out.println("Google ile sisteme loglandı. Kayıt başarılı: "+ user.getEmail());
        }
           
              
             
            
}
