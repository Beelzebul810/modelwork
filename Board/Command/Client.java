package Command;

public class Client {
    public static void main(String[] args) {
        Order order1=new Order();
        order1.setId(1);
        order1.setFruitmap("苹果",1);
        order1.setFruitmap("李子",2);
        order1.setFruitmap("香蕉",3);

        Order order2=new Order();
        order2.setId(2);
        order2.setFruitmap("橙子",5);
        order2.setFruitmap("橘子",2);
        order2.setFruitmap("柿子",3);

        Operator op=new Operator();
        OrderCommand orderCommand=new OrderCommand(op,order1);
        OrderCommand orderCommand2=new OrderCommand(op,order2);

        WaiterInvoker waiter=new WaiterInvoker();
        waiter.setCommands(orderCommand);
        waiter.setCommands(orderCommand2);

        waiter.orderup();
    }
}
