package Facade;

public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade generalSwitchFacade=new GeneralSwitchFacade();
        generalSwitchFacade.on();
        System.out.println("--------------------------");
        generalSwitchFacade.off();
    }
}
