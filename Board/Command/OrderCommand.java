package Command;

public class OrderCommand implements Command{
    private Operator receiver;
    private Order order;
    public OrderCommand(Operator receiver,Order order){
        this.receiver=receiver;
        this.order=order;
    }
    @Override
    public void execute() {
        System.out.println(order.getId()+"�Ź˿ͳ�Ʒ");
        receiver.makeFruit(order);
    }
}
