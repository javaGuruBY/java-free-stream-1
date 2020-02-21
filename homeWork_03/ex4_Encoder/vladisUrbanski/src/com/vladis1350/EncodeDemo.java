package com.vladis1350;

import com.vladis1350.bean.Encode;

public class EncodeDemo {
    public static void main(String[] args) {
        Encode encode = new Encode();

        encode.encode((short)119);
        encode.decode('S');

    }
}
