package ComMode;

import java.util.ArrayList;
import java.util.Iterator;

public class Plate extends MyElement {
    private ArrayList list = new ArrayList<>();

    @Override
    public void eat() {
//        for(Object o:list){
//            (MyElement)o.eat();
//        }
        ArrayList<MyElement> list = this.list;
        for (MyElement element : list) {
            element.eat();
        }
    }

    public void add(MyElement element) {
        list.add(element);
    }
    public void delete(MyElement element){
        list.remove(element);
    }
}
