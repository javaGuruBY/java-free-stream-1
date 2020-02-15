package Encoder;

public class Encoder {

    public Encoder() {

    }

    public void encode(short code) {
        System.out.println(code + " => '" + ((char)code) + "'");
    }

    public void decode(char symbol) {
        System.out.println("'" + symbol + "' => " + ((int)symbol));
    }

}
