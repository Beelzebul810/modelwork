
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
        return (MyFruit) fruit.clone();//ֱ�ӷ���fruit ��ʾ����ԭ����,��ʱ�����Զ�ԭ����������޸�
        // ��clone()�򷵻ظ��ƶ��󣬲��ܶ�ԭ��������޸�
    }
}