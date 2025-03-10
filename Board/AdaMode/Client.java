package AdaMode;

import ProMode.Apple;
import ProMode.Banana;
import ProMode.MyFruit;
import ProMode.MyFruitStore;

public class Client {
    public static void main(String[] args) {
        MyFruit fru4=new Apple();
        MyFruit fru5=new Banana();
        MyFruitStore myFruitStore1=MyFruitStore.getFruitstore();
        MyFruitStore.add(1,fru4);
        MyFruitStore.add(2,fru5);
        MyFruitStore.add(3,new Apple());
        MyFruitStore.add(4,new Banana());

        MyFruitStore myFruitStore=MyFruitStore.getFruitstore();
        InewJuicer newJuicer=new Adapter();
        System.out.println(newJuicer.newPort(myFruitStore.get(1),myFruitStore.get(1)));
    }
}
