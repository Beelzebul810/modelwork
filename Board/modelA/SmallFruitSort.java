package Chain;

public class SmallFruitSort extends AbstractFruitSort{
    public SmallFruitSort(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("¹ûÖ­£º"+fruit);
    }
}
