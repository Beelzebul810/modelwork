package Proxy;

public class Client {
    public static void main(String[] args) {
        ClocalPicShow clocalPicShow=new ClocalPicShow();
//        try {
//            clocalPicShow.showPic("photo");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        IshowPic ishowPic=new CRemoPic();
        IshowPic pic=(IshowPic) new ClocalPicShow();
        try {
            pic.showPic("AAAAA");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
