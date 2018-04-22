package cn.keking.design.behavior.interpreter;

/**
 * 终结者表达式类
 */
public class FinalExpression implements Expression {
    String key;

    public FinalExpression(String key) {
        this.key = key;
    }

    @Override
    public double interpret(Context context) {
        return context.map.get(key);
    }
}
