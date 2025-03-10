package StrMode;

public class FruitKnife implements ICutFruit{
    @Override
    public void cutStrategy(String fruitName) {
        System.out.println(fruitName+"被小刀片一次切成一片");
    }
}
