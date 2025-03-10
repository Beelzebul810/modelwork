package MemMode;

import java.util.ArrayList;

public class CaretakerChess {
    private ArrayList<MementoChess> memList=new ArrayList<>();
    public void addMem(MementoChess mem){
        memList.add(mem);
    }
    public MementoChess getMem(int i){
        return memList.get(i);
    }
}
