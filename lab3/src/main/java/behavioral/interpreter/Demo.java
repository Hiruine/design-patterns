
package behavioral.interpreter;

public class Demo {

    public static void main(String[] args) {
        Expression e1 = new IntegerExpression(5);
        Expression e2 = new IntegerExpression(6);
        Expression result = new AdditionExpression(e1, e2);
        System.out.println(result.evaluate());
    }
}
