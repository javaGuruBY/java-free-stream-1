package ex5_UserLoginService;

import java.util.Scanner;

public class User {
    String userName;
    String password;
    boolean blocked;
    int tryToLoginCount;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.blocked = false;
        this.tryToLoginCount = 3;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void resetLoginCount() {
        this.tryToLoginCount = 3;
    }

    public int getTryToLoginCount() {
        return tryToLoginCount;
    }

    public boolean userLogin(String userName, String enteredPassword) {
        if (getTryToLoginCount() <= 0 || isBlocked() == true) {
            System.out.println("User " + userName + " blocked!");
            return false;
        } else if (getPassword().equals(enteredPassword) & isBlocked() == false & getTryToLoginCount() > 0) {
            resetLoginCount();
            System.out.println(getUserName() + " has autorised!");
            return true;
        } else {
            this.tryToLoginCount -= 1;
            System.out.println("Left attempts: " + this.tryToLoginCount + " for user " + userName);
            return false;
        }
    }
}
