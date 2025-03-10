package IntMode;

public class Client {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        //语句John is male?、Julie is a married woman? 在这里没有任何意义。
        //解释运算： RobertJohn 是否 同时 包含 Robert和John
        System.out.println("John is male? " + isMale.interpret("RobertJohn"));
        //解释运算：Julie 是否 包含一个 Julie或married
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Julie"));
    }


    public static Expression getMaleExpression() {
        Expression robert =new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new AndExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie =new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");
        return new OrExpression(julie, married);
    }

}
