package State;

public class DeadState extends ThreadState{
    public DeadState(){
        state=StateSet.dead;
        System.out.println("线程死亡");
    }
}
