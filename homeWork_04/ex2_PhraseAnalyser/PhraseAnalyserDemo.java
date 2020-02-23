package ex2_PhraseAnalyser;

public class PhraseAnalyserDemo {
    public static void main(String[] args) {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        PhraseAnalyserTest test = new PhraseAnalyserTest();
        System.out.println(phraseAnalyser.analyse("Make Republic of Bulbastan great again"));
        System.out.println(phraseAnalyser.analyse("Let's do something great again"));
        System.out.println(phraseAnalyser.analyse("Bla-Bla-Bla"));
        test.testPhrase1();
        test.testPhrase2();
        test.testPhrase3();
        test.testPhrase4();
    }

}
