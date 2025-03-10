package Chain;

import Facade.Light;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
    private int weight;
    protected List<String> fruitBox;
    private AbstractFruitSort nextFruitSort;
    public void getFruitBox(){
        System.out.print("weight:"+weight+" ");
        System.out.println("¸öÊý£º"+fruitBox.size());
        for (String t: fruitBox) {
            System.out.print(t+",");
        }
        System.out.println(" ");
    }
    public void setNextFruitSort(AbstractFruitSort nextFruitSort){
        this.nextFruitSort=nextFruitSort;
    }
    public AbstractFruitSort(int weight){
        this.weight=weight;
        fruitBox=new ArrayList<String>();
    }
    public void sendFruit(int weight,String name){
        if(this.weight<=weight){
            pushBox(name);
        }
        else{
            if(nextFruitSort!=null){
                nextFruitSort.sendFruit(weight,name);
            }
        }
    }
    abstract protected void pushBox(String fruit);
}
