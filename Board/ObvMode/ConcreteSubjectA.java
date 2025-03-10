package ObvMode;

public class ConcreteSubjectA extends Subjects{
    public ConcreteSubjectA(){
        super();
    }
    @Override
    public void notifyObserver() {
        System.out.println("A目标改变");
        for(Observer ob:observers){
            ob.response();
        }
    }
}
