package VisitorMode;

public class Saler extends AVisitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("����Ա"+name+"����ƻ���۸��տ�");
    }

    @Override
    public void visit(Book book) {
        System.out.println("����Ա"+name+"�����鱾�۸��տ�");
    }
}
