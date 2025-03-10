package Chain;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        AbstractFruitSort bfs,mfs,sfs;
        bfs=new BigFruitSort(9);
        mfs=new MidFruitSort(5);
        sfs=new SmallFruitSort(2);

        //链
        bfs.setNextFruitSort(mfs);
        mfs.setNextFruitSort(sfs);

        Random random=new Random();
        for (int i = 0; i < 1000; i++) {
            int weight=random.nextInt(10);
            bfs.sendFruit(weight,"apple");
        }
        bfs.getFruitBox();
        mfs.getFruitBox();
        sfs.getFruitBox();
    }
}
