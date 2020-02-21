package PhraseAnalyser;

public class PhraseAnalyser {
    public String analyse(String text) {

        boolean isMake = text.startsWith("Make");
        boolean isGreatAgain = text.endsWith("grean again");
        if ((isMake) && (isGreatAgain)) {
            return "It stands no chance";
        } else if (isMake || isGreatAgain) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }

    }
}
