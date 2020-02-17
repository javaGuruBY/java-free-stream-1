package by.jrr.service;

import by.jrr.bean.Coder;

public class Decoder {
    public void decode(Coder encoder){
        System.out.println((short)encoder.getSym());
    }
}
