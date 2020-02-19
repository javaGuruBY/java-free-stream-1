package com.vladis1350;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import com.vladis1350.service.PhraseAnalyser;

public class PhraseAnalyserJUnitTest {

    PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

    @Test
    public void test1() {
        String expectedResult = phraseAnalyser.getAndMakeAndGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great again");
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void test2() {
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Some text] great again");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test3() {
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test4() {
        String expectedResult = phraseAnalyser.getNone();
        String actualResult = phraseAnalyser.analyse("Great some text again");
        assertEquals(expectedResult, actualResult);
    }
}
