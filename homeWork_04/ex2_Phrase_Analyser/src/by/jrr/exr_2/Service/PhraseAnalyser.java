package by.jrr.exr_2.Service;

public class PhraseAnalyser {

    public String analyse(String text) {
        boolean prefix = text.startsWith("Make");
        boolean suffix = text.endsWith("great again");

        if (prefix && suffix) {
            return "It stands no chance";
        } else if (prefix || suffix) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}
