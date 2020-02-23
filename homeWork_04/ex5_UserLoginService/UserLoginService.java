package ex5_UserLoginService;

import java.util.Scanner;

public class UserLoginService {

    public static void main(String[] args) {
        User user = new User("Vov4eg", "Intens1ve!");
        User user1 = new User("Someone", "o4en' silnyy parol'");
        Scanner input = new Scanner(System.in);
        user.userLogin(user.userName, "123456");
        user.userLogin(user.userName, "qwerty");
        user.userLogin(user.userName, "1q2w3e4r5t");
        user.resetLoginCount();
        user.userLogin(user.userName, user.password);
        user.setBlocked(true);
        user.userLogin(user.userName, user.password);
        user1.userLogin(user1.userName, user1.password);



    }

}
