
package javahomework5.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javahomework5.business.abstracts.UserService;
import javahomework5.business.abstracts.ValidationService;
import javahomework5.business.abstracts.VerificationService;
import javahomework5.core.concretes.JGoogleLoggerManagerAdapter;
import javahomework5.dataAccess.abstracts.UserDaoService;
import javahomework5.dataAccess.concretes.UserDao;
import javahomework5.entities.concretes.User;

public class UserManager implements UserService{
    List<User>users=new ArrayList<>();
    private UserDaoService userDaoService;
    private ValidationService validationService;
    private VerificationService verificationService;

    public UserManager(UserDaoService userDaoService, ValidationService validationService, VerificationService verificationService) {
        super();
        this.userDaoService = userDaoService;
        this.validationService = validationService;
        this.verificationService = verificationService;
    }

    private boolean checked = false;

	private final Pattern validEmailAddressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

    public UserManager(UserDao userDao, JGoogleLoggerManagerAdapter jGoogleLoggerManagerAdapter) {
       
    }

	private boolean validateEmail(String email) {
		Matcher matcher = validEmailAddressRegex.matcher(email);
		return matcher.find();
	}
   
       @Override
    public void add(User user) {
        if(user.getFirstName().length()<2|| user.getLastName().length()<2){
            System.out.println("İsim ve soyisim iki karakterden fazla olmalıdır. ");
            return;
        }
        else{
            checked=true;
        }
        if(!validateEmail(user.getEmail())){
            System.out.println("Lütfen geçerli bir email adresi  girin.");
            return;
        }
        else{
            checked=true;
        }
        
        
        if(user.getPassword().length()<6){
            System.out.println("Parola en az 6 haneli olmalıdır. ");
            return;
        }else{
        checked=true;
        }
        
        checked=true;
        if(checked=true){
            System.out.println("Email adresinize doğrulama kodu yollandı :"+ user.getEmail()); 
            System.out.println("Doğrulama linkine tıklayarak üyeliğinizi tamamlayabilirsiniz. " + user.getFirstName()+user.getLastName());
            
            System.out.println("Kayıt başarılı oldu : " + user.getFirstName()+ user.getLastName());
            
        }
        else{
            System.out.println("Lütfen bilgilerinizi tekrar kontrol edin.Kayıt başarısız oldu.");
        }
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcının bilgileri güncellendi: " + user.getFirstName()+ user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı sistemden kaldırıldı: " + user.getFirstName()+ user.getLastName());
    }

    @Override
    public  List<User> getAll() {       
        for(User user : users){
            if(checked=true){
                System.out.println("Kullanıcılar sisteme eklendi: "+ user.getFirstName()+ user.getLastName());
            }  
        }            
        return users;
    
    
    } 
    
    @Override
    public void login(User user){
        if(checked=true){
            System.out.println("Email ve parola doğru.Sisteme giriş başarılı:" + user.getFirstName() + user.getLastName());
        }
        else{
            System.out.println("Email ve/veya parola hatalı.");
        }
        
        
    }      
}         
        
    

    
    

