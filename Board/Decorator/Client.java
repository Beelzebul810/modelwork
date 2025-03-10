package Decorator;

public class Client {
    public static void main(String[] args) {
        IBirthdayCake birthdayCake=new Cake();
        birthdayCake.show();
        Cream cream=new Cream(birthdayCake);
        cream.putCream();
        Fruit fruit=new Fruit(birthdayCake);
        fruit.putFruit();
        fruit.show();
    }
}
