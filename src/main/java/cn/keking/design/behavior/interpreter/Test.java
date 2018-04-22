package cn.keking.design.behavior.interpreter;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.assign("a",10);
        context.assign("b",20);
        new FinalExpression("a").interpret(context);
        // a+b
        NonExpression nonExpression = new NonExpression(new FinalExpression("a"),new FinalExpression("b"));

        double val = nonExpression.interpret(context);
        System.out.println(val);
    }
}
