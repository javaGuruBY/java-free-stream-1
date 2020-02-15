package by.jrr.bean;

public class Encoder {
   private char sym;
   private short cod;

    public Encoder(char sym, short cod) {
        this.sym = sym;
        this.cod = cod;
    }

    public char getsym() {
        return sym;
    }

    public int getcod() {
        return cod;
    }
}