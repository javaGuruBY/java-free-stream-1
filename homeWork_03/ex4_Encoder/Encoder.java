package by.jrr;


public class Encoder {
    public void encode(short code) {
        Character symbol = (char) code;
        System.out.println(code + " => " + symbol);
    }

    public void decode(char symbol) {
        int code = symbol;
        System.out.println(symbol + " => " + code);
    }
}
