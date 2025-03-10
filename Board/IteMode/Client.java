package IteMode;

public class Client {
    public Client() {
    }

    public static void display(TV tv) {
        TVIte i = tv.createIte();
        System.out.println("µÁ ”∆µµ¿£∫");

        while(!i.isLast()) {
            System.out.println(i.currentChannel());
            i.next();
        }

    }

    public static void main(String[] args) {
        TV tv = (TV)XMLUtil.getBean();
        display(tv);
    }
}
