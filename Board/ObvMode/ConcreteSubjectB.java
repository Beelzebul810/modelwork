package ObvMode;

public class ConcreteSubjectB extends Subjects{
    public ConcreteSubjectB(){
        super();
    }
    @Override
    public void notifyObserver() {
        System.out.println("BĿ��ı�");
        for(Observer ob:observers){
            ob.response();
        }
    }
}
