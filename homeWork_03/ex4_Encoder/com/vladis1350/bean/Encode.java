package com.vladis1350.bean;

public class Encode {
    public void encode(short code) {
        Character sybmbol = (char)code;
        System.out.println(code + " => " + sybmbol);
    }

    public void decode(char symbol) {
        int code = symbol;
        System.out.println(symbol + " => " + code);
    }
}
