package cn.keking.design.behavior.strategy;

/**
 * 上下文环境类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calc(int a,int b) {
        return strategy.calc(a,b);
    }
}
