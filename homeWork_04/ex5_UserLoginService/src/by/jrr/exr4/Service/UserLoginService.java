package by.jrr.exr4.Service;

import by.jrr.exr4.bean.User;

public class UserLoginService {

    public boolean login(User user, String password) {

        if (user.getPassword().equals(password)) {
            System.out.println(user.getLogin() + " logged in system successfully!");
            System.out.println("Status user "+user.getStatusUser()+".\n");
            return true;

        } else if (!user.getPassword().equals(password) && user.getAttemptInput() != 0) {
            user.setAttemptInput(user.getAttemptInput()-1);
            if(user.getAttemptInput()==2){
                user.setStatusUser(true);
                System.out.println(user.getLogin() + " not logged in! Try again!");
                System.out.println("Status user "+user.getStatusUser()+".\n");
            }
            if(user.getAttemptInput()==1){
                user.setStatusUser(true);
                System.out.println(user.getLogin() + " not logged in! Try again!");
                System.out.println("Status user "+user.getStatusUser()+".\n");
            }
            if(user.getAttemptInput()==0){
                user.setStatusUser(false);
                System.out.println(user.getLogin() + " you are blocking!!!");
                System.out.println("Status user "+user.getStatusUser()+".\n");
            }
            return false;
        } else  {
            user.setStatusUser(false);
            System.out.println(user.getLogin() + " you are blocking!!!");
            System.out.println("Status user "+user.getStatusUser()+".\n");
        }
        return false;
    }

}






