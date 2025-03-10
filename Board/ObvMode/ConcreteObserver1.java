package ObvMode;

public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("目标发生变化，1反应");
    }
}
