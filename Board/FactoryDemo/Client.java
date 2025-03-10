package FactoryDemo;

public class Client {
    public static void main(String[] args) {
//        Factory factory=new AFactory();
        Factory factory=(Factory)XMLUtil.getBean() ;
        Fruit fruit=factory.createFruit();
        fruit.eat();
    }
//    public String factory(String fruitname){
//        if(fruitname.equals("apple"))
//            return "apple";
//        if(fruitname.equals("banana"))
//            return "banana";
//        return null;
//    }
}
