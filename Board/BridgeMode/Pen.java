package BridgeMode;

public abstract class Pen {
    protected Color color;
    public abstract void draw(String name);
    public void setColor(Color color){
        this.color=color;
    }
}
