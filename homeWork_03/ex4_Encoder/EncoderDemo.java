package by.jrr;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder data = new Encoder();
        data.encode((short)65);
        data.decode('X');
    }
}
