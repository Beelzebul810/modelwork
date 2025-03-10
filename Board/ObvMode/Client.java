package ObvMode;

public class Client {
    public static void main(String[] args) {
        Subjects subjects=new ConcreteSubjectB();
        Observer observer1=new ConcreteObserver1();
        Observer observer2=new ConcreteObserver2();
        subjects.add(observer1);
        subjects.add(observer2);
        subjects.notifyObserver();
    }
}
