package by.jrr.tests;

import by.jrr.phrase.PhraseAnalyser;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();

        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
    }

    public void test1() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String s = "Make a s great again";
        String expectedResult = "It stands no chance";
        String actualResult = victim.analyse(s);
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String s = "Make go home little";
        String expectedResult = "It could be worse";
        String actualResult = victim.analyse(s);
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String s = "Oh! My God!";
        String expectedResult = "It is fine, really";
        String actualResult = victim.analyse(s);
        check(actualResult, expectedResult, "test3");
    }

    public void test4() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String s = "Make great again";
        String expectedResult = "It stands no chance";
        String actualResult = victim.analyse(s);
        check(actualResult, expectedResult, "test4");
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if(actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        }
        else {
            System.out.println(testName + " is failed!");
            System.out.println("Expected \"" + expectedResult + "\" but was \"" + actualResult + "\"");
        }
    }
}