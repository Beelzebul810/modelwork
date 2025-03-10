package State;

public class RunnableState extends ThreadState{
    public RunnableState(){
        state=StateSet.runnable;
        System.out.println("����״̬");
    }
    public void getCpu(ThreadContext threadContext){
        System.out.println("���cpu");
        if(state==StateSet.runnable)
            threadContext.setThreadState(new RunningState());
        else
            System.out.println("��ǰ���Ǿ���״̬");
    }
}
