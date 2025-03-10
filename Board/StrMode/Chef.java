package StrMode;

public class Chef {
    private ICutFruit cutMethod;
    public void setCutMethod(ICutFruit cutMethod) {
        this.cutMethod = cutMethod;
    }
    public void cutFruit(String fruitName) {
        cutMethod.cutStrategy(fruitName);
    }
}
