package ObvMode;

public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("目标发生变化，2反应");
    }
}
