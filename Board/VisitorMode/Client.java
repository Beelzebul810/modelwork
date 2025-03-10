package VisitorMode;

import VisitorMode.XMLUtil;

public class Client {
    public static void main(String[] args) {
        IProduct b1=new Book();
        IProduct b2=new Book();
        IProduct a1=new Apple();
        AVisitor aVisitor;

        BuyBasket basket=new BuyBasket();
        basket.addProduct(b1);
        basket.addProduct(b2);
        basket.addProduct(a1);

        aVisitor=(AVisitor) XMLUtil.getBean();
        aVisitor.setName("уехЩ");
        basket.accept(aVisitor);
    }
}
