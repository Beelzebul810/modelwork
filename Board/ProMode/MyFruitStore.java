
package ProMode;

import java.util.Hashtable;

public class MyFruitStore {
//    private static Hashtable fruittab=new Hashtable<Integer,MyFruit>();
    private static Hashtable fruittab=null;
    private static MyFruitStore fruitstore=null;
    private MyFruitStore(){
        fruittab=new Hashtable<Integer,MyFruit>();
    }
    public static MyFruitStore getFruitstore(){
        if(fruitstore==null){
            fruitstore=new MyFruitStore();
        }
        return fruitstore;
    }
    public static void add(Integer key,MyFruit fruit){
        fruittab.put(key,fruit);
    }
    public static MyFruit get(Integer key){
        MyFruit fruit=(MyFruit) fruittab.get(key);
        return (MyFruit) fruit.clone();//直接返回fruit 表示返回原对象,此时外界可以对原来对象进行修改
        // 而clone()则返回复制对象，不能对原对象进行修改
    }
}