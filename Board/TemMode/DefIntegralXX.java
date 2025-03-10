package TemMode;

public class DefIntegralXX extends ADefiniteIntegral {
    private double a;
    private double b;
    private int c;

    public DefIntegralXX(double a, double b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected double geta() {
        return this.a;
    }

    protected double getb() {
        return this.b;
    }

    protected int getc() {
        return this.c;
    }

    protected double function(double x) {
        return x;
    }
}