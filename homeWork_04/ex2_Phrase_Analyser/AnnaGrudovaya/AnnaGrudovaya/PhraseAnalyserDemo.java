package PhraseAnalyser;

public class PhraseAnalyserDemo {
    public static void main(String[] args) {
        PhraseAnalyser analyser = new PhraseAnalyser();
        System.out.println(analyser.analyse("Make  ff grean again"));
        System.out.println(analyser.analyse("Make again"));
        System.out.println(analyser.analyse("grean again"));
        System.out.println(analyser.analyse("Anna"));

    }
}
