package State;

public class BlockedState extends ThreadState{
    public BlockedState(){
        state=StateSet.blocked;
        System.out.println("����״̬");
    }
    public void resume(ThreadContext threadContext){
        System.out.println("����resume����");
        if(state==StateSet.blocked)
            threadContext.setThreadState(new RunnableState());
        else
            System.out.println("��ǰ��������״̬");
    }

}
