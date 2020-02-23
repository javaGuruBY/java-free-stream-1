package ex2_PhraseAnalyser;

public class PhraseAnalyserTest {
    PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

    public void selfTest(String expected, String actual, String description) {
        if (actual.equals(expected)) {
            System.out.println(description + " passed!");
        } else {
            System.out.println(description + " FAILED");
        }
    }

    public void testPhrase1() {
        String description = "Test for make AND great again";
        String expected = phraseAnalyser.getMakeAndGreatAgain();
        String actual = phraseAnalyser.analyse("Make something somewhere great again");
        selfTest(expected, actual, description);
    }

    public void testPhrase2() {
        String description = "Test for make OR great again";
        String expected = phraseAnalyser.getMakeOrGreatAgain();
        String actual = phraseAnalyser.analyse("Let's do grandfather samogon great again");
        selfTest(expected, actual, description);

    }

    public void testPhrase3() {
        String description = "Test for make OR great again (second test)";
        String expected = phraseAnalyser.getMakeOrGreatAgain();
        String actual = phraseAnalyser.analyse("Make fun with sudo rm -rf");
        selfTest(expected, actual, description);

    }

    public void testPhrase4() {
        String description = "Test for other text";
        String expected = phraseAnalyser.getNotMakeAndGreatAgain();
        String actual = phraseAnalyser.analyse("Кто-нибудь кроме Максима вообще вчитавается в то, что мы пишем? :)");
        selfTest(expected, actual, description);

    }
}
