package VisitorMode;

public class Saler extends AVisitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("收银员"+name+"计算苹果价格，收款");
    }

    @Override
    public void visit(Book book) {
        System.out.println("收银员"+name+"计算书本价格，收款");
    }
}
