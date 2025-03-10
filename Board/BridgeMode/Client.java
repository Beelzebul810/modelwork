package BridgeMode;

public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen;
        color=(Color) XMLUtilPen.getBean("color");//∑¥…‰ ’“—’¡œ
        pen=(Pen) XMLUtilPen.getBean("pen");
        pen.setColor(color);
        pen.draw("œ ª®");
    }
}
