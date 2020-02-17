package by.jrr.bean;

public class Coder {
    private char sym;
    private short cod;

    public Coder(char sym, short cod) {
        this.sym = sym;
        this.cod = cod;
    }


    public char getSym() {
        return sym;
    }

    public short getCod() {
        return cod;
    }
}
