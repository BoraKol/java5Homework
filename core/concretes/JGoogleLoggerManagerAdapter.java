
package javahomework5.core.concretes;

import javahomework5.core.abstracts.JGoogleLoggerService;
import javahomework5.entities.concretes.User;

import javahomework5.jGoogleLogger.JGoogleLoggerManager;

public class JGoogleLoggerManagerAdapter implements JGoogleLoggerService{

    @Override
    public void logInWıthGoogle(User user) {
        JGoogleLoggerManager jGoogleLoggerManager=new JGoogleLoggerManager();
        jGoogleLoggerManager.LogInWithGoogle(user);
        
    }   
    
}
