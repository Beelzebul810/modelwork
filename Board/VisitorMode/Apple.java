package VisitorMode;

public class Apple implements IProduct{
    @Override
    public void accept(AVisitor visitor) {
        visitor.visit(this);
    }
}
