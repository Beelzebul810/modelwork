package State;

public class NewState extends ThreadState{
    public NewState(){
        state=StateSet.creat;
        System.out.println("新建线程");
    }
    public void start(ThreadContext threadContext){
        System.out.println("调用start方法");
        if(state==StateSet.creat)
            threadContext.setThreadState(new RunnableState());
        else
            System.out.println("当前线程不是新建状态");
    }
}
