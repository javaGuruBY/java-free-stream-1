package by.jrr;

import by.jrr.service.Encoder;
import by.jrr.service.Decoder;
import by.jrr.bean.Coder;

public class App {
    public static void main(String[] args) {
       Coder coder = new Coder('Q', (short) 90);
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        encoder.encode(coder);
        decoder.decode(coder);




    }
}
