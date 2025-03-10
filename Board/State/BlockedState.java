package State;

public class BlockedState extends ThreadState{
    public BlockedState(){
        state=StateSet.blocked;
        System.out.println("阻塞状态");
    }
    public void resume(ThreadContext threadContext){
        System.out.println("调用resume方法");
        if(state==StateSet.blocked)
            threadContext.setThreadState(new RunnableState());
        else
            System.out.println("当前不是阻塞状态");
    }

}
