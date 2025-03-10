package FlyMode;

import java.util.HashMap;

public class PieceFactory {
    private HashMap piecePool=new HashMap<>();
    public Apiece getPiece(String key){
        if(!piecePool.containsKey(key)){
            Apiece piece=new OnePiece(key);
            piecePool.put(key,piece);
            return piece;
        }
        return (Apiece) piecePool.get(key);
    }
    public int getPieceCount(){
        return piecePool.size();
    }
}
