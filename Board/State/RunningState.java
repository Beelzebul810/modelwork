package State;

public class RunningState extends ThreadState{
    public RunningState(){
        state=StateSet.running;
        System.out.println("运行状态");
    }
    public void suspend(ThreadContext threadContext){
        System.out.println("调用suspend方法");
        if(state==StateSet.running)
            threadContext.setThreadState(new BlockedState());
        else
            System.out.println("当前不是运行状态");
    }
    public void stop(ThreadContext threadContext){
        System.out.println("调用stop方法");
        if(state==StateSet.running)
            threadContext.setThreadState(new DeadState());
        else
            System.out.println("当前不是运行状态");
    }
}
