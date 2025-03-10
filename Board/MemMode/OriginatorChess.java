package MemMode;

public class OriginatorChess {
    private MementoChess memchess;
    public OriginatorChess(MementoChess memchess) {
        this.memchess = memchess;
    }
    public void setX(int x) {
        memchess.setX(x);
    }
    public void setY(int y) {
        memchess.setY(y);
    }
    public MementoChess savetoMemento() {
        return new MementoChess(memchess.getLabel(),memchess.getX(),memchess.getY());
    }
    public void restore(MementoChess memchess) {
        this.memchess.setLabel(memchess.getLabel());
        this.memchess.setX(memchess.getX());
        this.memchess.setY(memchess.getY());
    }
    public void show(){
        System.out.println("当前棋子状态："+
                memchess.getLabel()+"("+
                memchess.getX()+","+
                memchess.getY()+")"
        );
    }
}
