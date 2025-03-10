package State;

public class RunnableState extends ThreadState{
    public RunnableState(){
        state=StateSet.runnable;
        System.out.println("就绪状态");
    }
    public void getCpu(ThreadContext threadContext){
        System.out.println("获得cpu");
        if(state==StateSet.runnable)
            threadContext.setThreadState(new RunningState());
        else
            System.out.println("当前不是就绪状态");
    }
}
