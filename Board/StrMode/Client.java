package StrMode;
public class Client {
    public static void main(String[] args) {
        Chef chef = new Chef();

        //这里可以采用不同的切水果策略 通过实例 ICutFruit不同的子类（FruitKnife、HoriBlade、MultiBlade）
        ICutFruit cut=new MultiBlade();

        chef.setCutMethod(cut);
        chef.cutFruit("apple");
    }
}
