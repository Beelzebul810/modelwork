package State;

public class Client {
    public static void main(String[] args) {
        ThreadContext threadContext=new ThreadContext();
        threadContext.start();
        threadContext.getCPU();
        threadContext.stop();
    }
}
