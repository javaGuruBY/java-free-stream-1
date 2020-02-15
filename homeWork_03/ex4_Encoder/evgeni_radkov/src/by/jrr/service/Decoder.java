package by.jrr.service;

import by.jrr.bean.Encoder;

public class Decoder {
    public void decode(Encoder encoder){
        System.out.println((short)encoder.getsym());
    }
}
