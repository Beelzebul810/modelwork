package Chain;

public class MidFruitSort extends AbstractFruitSort{
    public MidFruitSort(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("¹ÞÍ·£º"+fruit);
    }
}
