package TemMode;

public abstract class ADefiniteIntegral {

    protected abstract double geta();
    protected abstract double getb();
    protected abstract int getc();
    protected abstract double function(double var1);
    public final double calDefiniteIntegral() {
        double a = 0.0;
        double b = 0.0;
        double t = 0.0;
        double sum = 0.0;
        int c =0;
        a = this.geta();
        b = this.getb();
        c = this.getc();
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }

        t = (b - a) / (double)c;

        for(int i = 0; i < c; ++i) {
            sum += t * this.function(a + (double)i * t);
        }

        return sum;
    }
}