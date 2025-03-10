package Decorator;

public class Decorating implements IBirthdayCake{
    private  IBirthdayCake birthdayCake;
    public Decorating(IBirthdayCake birthdayCake){
        this.birthdayCake=birthdayCake;
    }
    @Override
    public void show() {
        birthdayCake.show();
    }
}
