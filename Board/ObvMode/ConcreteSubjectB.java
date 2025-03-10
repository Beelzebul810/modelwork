package ObvMode;

public class ConcreteSubjectB extends Subjects{
    public ConcreteSubjectB(){
        super();
    }
    @Override
    public void notifyObserver() {
        System.out.println("B目标改变");
        for(Observer ob:observers){
            ob.response();
        }
    }
}
