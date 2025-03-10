package Decorator;

public class Cake implements IBirthdayCake {
    public Cake(){
        System.out.println("创建蛋糕胚");
    }
    @Override
    public void show() {
        System.out.println("展示蛋糕胚");
    }
}
