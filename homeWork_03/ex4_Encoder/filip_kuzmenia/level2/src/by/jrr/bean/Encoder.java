package by.jrr.bean;

public class Encoder {
   private char let;
   private int num;

    public Encoder(char let, int num) {
        this.let = let;
        this.num = num;
    }

    public char getLet() {
        return let;
    }

    public int getNum() {
        return num;
    }
}