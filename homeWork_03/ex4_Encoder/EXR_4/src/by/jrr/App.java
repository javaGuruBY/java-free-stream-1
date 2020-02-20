package by.jrr;

import by.jrr.Service.Decode;
import by.jrr.Service.Encode;
import by.jrr.bean.Encoder;

public class App {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Encode encode = new Encode();
        Decode decode = new Decode();
        encode.encode(65);
        decode.decode('X');
    }
}