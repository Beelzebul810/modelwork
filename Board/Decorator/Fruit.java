package Decorator;

public class Fruit extends Decorating{
    public Fruit(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }//����ʵ�ָ��๹�췽��
    public void putFruit(){
        System.out.println("���ˮ��װ��...");
    }
}
