package Decorator;

public class Fruit extends Decorating{
    public Fruit(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }//子类实现父类构造方法
    public void putFruit(){
        System.out.println("添加水果装饰...");
    }
}
