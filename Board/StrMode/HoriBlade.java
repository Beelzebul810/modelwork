package StrMode;

public class HoriBlade implements ICutFruit{
    @Override
    public void cutStrategy(String fruitName) {
        System.out.println(fruitName+"被横刀片一次切成几片");
    }
}
