package StrMode;

public class MultiBlade implements ICutFruit{
    @Override
    public void cutStrategy(String fruitName) {
        System.out.println(fruitName+"被多锋刀片一次切成八瓣");
    }
}
