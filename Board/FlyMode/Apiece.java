package FlyMode;

public abstract class Apiece {
    protected String inKind;
    public Apiece(String inKind){
        this.inKind=inKind;
    }
    public abstract void play(int x,int y);
}
