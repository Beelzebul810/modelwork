
package ProMode;

public class MyFruit implements Cloneable{
    protected String kind;
    public Object clone(){
        Object obj=null;
        try {
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
    public void display(){
        System.out.println(kind);
    }
    public String get(){
        return this.kind;
    }
}