package ObvMode;

import java.util.ArrayList;
import java.util.List;

public abstract class Subjects {
    protected List<Observer> observers;
    public Subjects(){
        observers=new ArrayList<Observer>();
    }
    public void add(Observer observer){
        observers.add(observer);
    }
    public void remove(Observer observer){
        observers.remove(observer);
    }
    public abstract void notifyObserver();
}
