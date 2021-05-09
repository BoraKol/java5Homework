
package javahomework5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import javahomework5.dataAccess.abstracts.UserDaoService;
import javahomework5.entities.concretes.User;

public class UserDao implements UserDaoService{
 
    List<User>users=new ArrayList<>();
    
    
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı eklendi : "+ user.getFirstName()+ user.getLastName());
        users.add(user);
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı bilgileri güncellendi: " +user.getFirstName()+ user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı sistemden kaldırıldı: " + user.getFirstName()+user.getLastName());
    }

    @Override
    public List<User> getAll() {
        
       return users;    
    }

}