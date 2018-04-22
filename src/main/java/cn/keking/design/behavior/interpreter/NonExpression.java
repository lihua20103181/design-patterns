package cn.keking.design.behavior.interpreter;

/**
 * 非终结者表达式类（两个数相加）
 */
public class NonExpression implements Expression {
    Expression one;
    Expression two;

    public NonExpression(Expression one, Expression two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public double interpret(Context context) {
        return one.interpret(context)+two.interpret(context);
    }
}
