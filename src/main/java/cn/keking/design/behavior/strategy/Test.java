package cn.keking.design.behavior.strategy;

public class Test {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.calc(10,10);
    }
}
