package AdaMode;

import ProMode.MyFruit;

public class Adapter extends OldJuicer implements InewJuicer{

    @Override
    public String newPort(MyFruit fruit1, MyFruit fruit2) {
        String str="»ìºÏ¹ûÖ­"+onePort(fruit1);
        str+=onePort(fruit2);
        return str;
    }
}
