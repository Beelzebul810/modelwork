package Chain;

public class BigFruitSort extends AbstractFruitSort{
    public BigFruitSort(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
       fruitBox.add("³¬ÊÐ£º"+fruit);
    }
}
