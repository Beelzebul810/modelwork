package Command;

public class Operator {
    public void makeFruit(Order order){
        String str="";
        for(String key:order.getFruitmap().keySet()){
            str+=key+order.getFruitmap().get(key);
        }
        System.out.println("»ìºÏ¹ûÖ­£º"+str);
    }
}
