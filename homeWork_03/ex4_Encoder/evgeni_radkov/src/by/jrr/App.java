package by.jrr;

import by.jrr.service.CharToInt;
import by.jrr.service.Decoder;
import by.jrr.bean.Encoder;

public class App {
    public static void main(String[] args) {
       Encoder code = new Encoder('Q', (short) 65);
        CharToInt charToInt = new CharToInt();
        Decoder decoder = new Decoder();
        charToInt.encoder(code);
        decoder.decode(code);




    }
}
