package Facade;

public class Light {
    private String pos;
    public Light(String pos){
        this.pos=pos;
    }
    public void on(){
        System.out.println(this.pos+"µÆ´ò¿ª");
    }
    public void off(){
        System.out.println(this.pos+"µÆ¹Ø±Õ");
    }
}
