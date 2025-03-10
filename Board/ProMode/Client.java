
package ProMode;

public class Client {
    public static void main(String[] args) {
//        MyFruit fru1=new Apple();
//        MyFruit fru2=fru1;
//        MyFruit fru3=(Apple)fru1.clone();
//        System.out.println(fru1==fru2);
//        System.out.println(fru1==fru3);
//        fru1.display();
//        fru2.display();
//        fru3.display();
//        System.out.println(fru1.hashCode());
//        System.out.println(fru2.hashCode());
//        System.out.println(fru3.hashCode());

        MyFruit fru4=new Apple();
        MyFruit fru5=new Banana();
        MyFruitStore myFruitStore1=MyFruitStore.getFruitstore();
        MyFruitStore.add(1,fru4);
        MyFruitStore.add(2,fru5);
        MyFruitStore.add(3,new Apple());
        MyFruitStore.add(4,new Banana());
        MyFruitStore myFruitStore2=MyFruitStore.getFruitstore();
        MyFruit fruit=myFruitStore1.get(1);
        fruit.display();
        System.out.println(myFruitStore1.toString());
        System.out.println(myFruitStore2.toString());
    }
}
