package Proxy;

public class CRemoPic implements IshowPic{

    @Override
    public void showPic(String picname) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1);
            Thread.sleep(1000);
        }
    }
}
