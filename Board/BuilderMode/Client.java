package BuilderMode;

public class Client {
    public static void main(String[] args) {
        MealBuilder mb=(MealBuilder)XMLUtil.getBean();
        KFCWaiter waiter=new KFCWaiter();
        waiter.setMb(mb);
        Meal meal=waiter.construct();

        System.out.println("meal£º");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
