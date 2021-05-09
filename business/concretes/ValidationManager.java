
package javahomework5.business.concretes;

import java.util.regex.Pattern;
import javahomework5.business.abstracts.ValidationService;
import javahomework5.entities.concretes.User;

public class ValidationManager implements ValidationService{
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	

    @Override
    public boolean checkFirstNameLength(User user) {
        if(user.getFirstName().length()<2){
            System.out.println("Lütfen daha uzun bir isim girin.");
            return false;                   
        }
        return true;
        
    }

    @Override
    public boolean checkLastNameLength(User user) {
        if(user.getLastName().length()<2){
            System.out.println("Lütfen daha uzun bir soyisim girin.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkEmailFormat(User user) {
        return VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail()).find();
    }

    @Override
    public boolean checkThePassword(User user) {
        if(user.getPassword().length()<6){
            System.out.println("Lütfen daha uzun bir parola girin.");
            return false;
        }
        return true;
    }
    
}
