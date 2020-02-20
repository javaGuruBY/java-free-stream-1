package by.jrr.Service;

import by.jrr.bean.Encoder;

public class Encode {
    public void encode(int code) {
        System.out.println(code + " => " + Character.valueOf((char) code));

    }
}
