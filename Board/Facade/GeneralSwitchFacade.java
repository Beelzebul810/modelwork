package Facade;

public class GeneralSwitchFacade {
    private Light lis[]=new Light[4];
    private Fan fan;
    private AirConditioner airConditioner;
    private  Television tv;
    public GeneralSwitchFacade(){
        lis[0]=new Light("客厅");
        lis[1]=new Light("厨房");
        lis[2]=new Light("卫生间");
        lis[3]=new Light("卧室");
        fan=new Fan();
        airConditioner=new AirConditioner();
        tv=new Television();
    }
    public void on(){
        lis[0].on();
        lis[1].on();
        lis[2].on();
        lis[3].on();
        fan.on();
        airConditioner.on();
        tv.on();
    }
    public void off(){
        lis[0].off();
        lis[1].off();
        lis[2].off();
        lis[3].off();
        fan.off();
        airConditioner.off();
        tv.off();
    }
}
