
package behavioral.interpreter;


public class IntegerExpression implements Expression {

    private int value;

    public IntegerExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

}
