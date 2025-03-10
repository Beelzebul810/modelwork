package FlyMode;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        PieceFactory pieceFactory = new PieceFactory();
        for (int i = 0; i < 19; i++) {
            for (int j=0;j<19;j++){
                Apiece p;
                if(random.nextInt()%2==0)
                    p=pieceFactory.getPiece("白");
                else
                    p=pieceFactory.getPiece("黑");
                p.play(random.nextInt(19),random.nextInt(19));
            }
            System.out.println("棋子对象个数："+pieceFactory.getPieceCount());
        }
    }
}
