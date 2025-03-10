package State;

public class RunningState extends ThreadState{
    public RunningState(){
        state=StateSet.running;
        System.out.println("����״̬");
    }
    public void suspend(ThreadContext threadContext){
        System.out.println("����suspend����");
        if(state==StateSet.running)
            threadContext.setThreadState(new BlockedState());
        else
            System.out.println("��ǰ��������״̬");
    }
    public void stop(ThreadContext threadContext){
        System.out.println("����stop����");
        if(state==StateSet.running)
            threadContext.setThreadState(new DeadState());
        else
            System.out.println("��ǰ��������״̬");
    }
}
