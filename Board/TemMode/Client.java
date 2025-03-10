package TemMode;

public class Client {

    public static void main(String[] args) {
        ADefiniteIntegral[] x = new ADefiniteIntegral[]{new DefIntegralXX(0.0, 20.0, 100), new DefIntegralLn(2.71, 20.0, 100)};

        for(int i = 0; i < 2; ++i) {
            System.out.println(x[i].calDefiniteIntegral());
        }

    }
}
