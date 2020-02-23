package by.jrr.exr_2;

import by.jrr.exr_2.Service.PhraseAnalyser;

public class App {
    public static void main(String[] args) {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        System.out.println( phraseAnalyser.analyse("Make"));
        System.out.println( phraseAnalyser.analyse("Make great again") );
        System.out.println( phraseAnalyser.analyse("Alexandro") );
    }
}
