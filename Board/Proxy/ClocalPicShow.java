package Proxy;

public class ClocalPicShow implements IshowPic,Runnable{
    private IshowPic pic;
    private String picname;
    @Override
    public void run(){
        try {
            pic.showPic(picname);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(picname+"图片调用完成");
    }

    @Override
    public void showPic(String picname) throws InterruptedException {
        pic=new CRemoPic();
        this.picname=picname;
        System.out.println("载入图片"+picname);
        Thread th=new Thread(this);
        th.start();

    }
}
