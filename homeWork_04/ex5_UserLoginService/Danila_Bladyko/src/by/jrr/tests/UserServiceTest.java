package by.jrr.tests;

import by.jrr.main_user.User;
import by.jrr.service.UserLoginService;

public class UserServiceTest {

    public static void main(String[] args) {
        UserServiceTest testRunner = new UserServiceTest();

        testRunner.test1();
        testRunner.test2();
    }

    public void test1() {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password", 3);

        service.login(userOne, "user-password-12345");
        service.login(userOne, "user-password");
        boolean expectedResult1 = false;
        boolean expectedResult2 = true;
        boolean actualResult1 = service.login(userOne, "user-password-12345");
        boolean actualResult2 = service.login(userOne, "user-password");
        check(actualResult1, actualResult2, expectedResult1, expectedResult2, "test1");

    }

    public void test2() {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user", "password", 1);

        service.login(userOne, "user-password");
        boolean expectedResult1 = false;
        boolean expectedResult2 = false;
        boolean actualResult1 = service.login(userOne, "12345");
        boolean actualResult2 = service.login(userOne, "password");
        check(actualResult1, actualResult2, expectedResult1, expectedResult2, "test2");
    }

    public void check(boolean actualResult1, boolean actualResult2, boolean expectedResult1, boolean expectedResult2, String testName) {
        if((actualResult1 == expectedResult1) && actualResult2 == expectedResult2) {
            System.out.println(testName + " has passed!");
        }
        else {
            System.out.println(testName + " is failed!");
            System.out.println("Expected \"" + expectedResult1 + "\", \"" + expectedResult2 +"\" but was \"" + actualResult1 + "\" \"" + actualResult2 + "\"");
        }
    }
}
