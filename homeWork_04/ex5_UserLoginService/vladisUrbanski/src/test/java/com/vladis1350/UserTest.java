package com.vladis1350;

import com.vladis1350.bean.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void test1() {
        User user = new User("Vladislav", "122334");
        String expectedResult = "User: userLogin='Vladislav', userPassword='122334', userAccess=true, countAttempt=3";
        String actualResult = user.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() {
        User user = new User("Vladislav", "122334");
        String expectedResult = "Vladislav";
        String actualResult = user.getUserLogin();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test3() {
        User user = new User("Vladislav", "122334");
        String expectedResult = "122334";
        String actualResult = user.getUserPassword();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test4() {
        User user = new User("Vladislav", "122334");
        boolean expectedResult = true;
        boolean actualResult = user.isUserAccess();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test5() {
        User user = new User("Vladislav", "122334");
        int expectedResult = 3;
        int actualResult = user.getCountAttempt();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test6() {
        User user = new User("Vladislav", "122334");
        user.setUserLogin("Victor");
        String expectedResult = "Victor";
        String actualResult = user.getUserLogin();
        assertEquals(expectedResult, actualResult);
    }
}
