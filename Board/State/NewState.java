package State;

public class NewState extends ThreadState{
    public NewState(){
        state=StateSet.creat;
        System.out.println("�½��߳�");
    }
    public void start(ThreadContext threadContext){
        System.out.println("����start����");
        if(state==StateSet.creat)
            threadContext.setThreadState(new RunnableState());
        else
            System.out.println("��ǰ�̲߳����½�״̬");
    }
}
