package by.jrr.exr4;

import by.jrr.exr4.bean.User;
import by.jrr.exr4.Service.UserLoginService;

public class App {
    public static void main(String[] args) {
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Flashsan", "Alex12", true);
        user.setAttemptInput(3);
        userLoginService.login(user, "Alex12");
        userLoginService.login(user, "Alex121");
        userLoginService.login(user, "Alex121");
        userLoginService.login(user, "Alex121");
        userLoginService.login(user, "Alex121");



    }
}
