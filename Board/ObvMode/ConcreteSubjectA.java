package ObvMode;

public class ConcreteSubjectA extends Subjects{
    public ConcreteSubjectA(){
        super();
    }
    @Override
    public void notifyObserver() {
        System.out.println("AĿ��ı�");
        for(Observer ob:observers){
            ob.response();
        }
    }
}
