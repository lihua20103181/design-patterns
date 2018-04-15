package cn.keking.design.behavior.strategy;

/**
 * 具体策略类，实现了抽象策略类接口方法
 */
public class ConcreteStrategy implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
