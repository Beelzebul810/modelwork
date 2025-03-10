package BuilderMode;

public class SubMealBuilderA extends MealBuilder{
    public void buildFood(){
        meal.setFood("a hamburger");
    }
    public void buildDrink(){
        meal.setDrink("a cup of cola");
    }
}
