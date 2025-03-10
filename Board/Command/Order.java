package Command;

import java.util.HashMap;

public class Order {
    private int id;
    private HashMap<String,Integer> fruitmap;
    public Order(){
        fruitmap=new HashMap<>();
    }
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Integer> getFruitmap() {
        return fruitmap;
    }

    public void setFruitmap(String fruidkind,int num) {
        this.fruitmap.put(fruidkind,num);
    }
}
