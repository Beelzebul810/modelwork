package MemMode;

public class Client {
    public static void main(String[] args) {
        OriginatorChess chess=new OriginatorChess(new MementoChess("黑",2,2));
        play(chess);
        chess.setX(3);
        play(chess);
        chess.setY(6);
        play(chess);
        undo(chess);
        undo(chess);
        reduo(chess);
        reduo(chess);
    }

    private static int index=0;     //记录棋子移动索引
    private static CaretakerChess caretaker=new CaretakerChess();

    /**
     * play:移动一次棋子 记录一次状态
     * 将 当前棋子的坐标 添加到 CaretakerChess caretaker 的列表中
     */
    private static void play(OriginatorChess chess) {
        index++;
        caretaker.addMem(chess.savetoMemento());
        chess.show();
    }

    /**
     * undo:回到棋子的上一次状态
     * 用 index索引 找到 CaretakerChess caretaker 的列表中 上一个位置的 MementoChess对象，赋值 给棋子
     */
    private static void undo(OriginatorChess chess) {
        System.out.println("********悔棋*********");
        index--;
        chess.restore(caretaker.getMem(index-1));
        chess.show();
    }
    /**
     * reduo:进去下一个状态
     * 如果 index索引 是 列表中最后一个元素(即没有悔过棋)，会报错(列表下标越界)
     * 用 index索引 找到 CaretakerChess caretaker 的列表中 下一个位置的 MementoChess对象，赋值 给棋子
     */
    private static void reduo(OriginatorChess chess) {
        System.out.println("*******撤销悔棋********");
        chess.restore(caretaker.getMem(index));
        index++;
        chess.show();
    }
}
