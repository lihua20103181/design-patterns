package cn.keking.design.behavior.chain;

/**
 * 抽象处理类
 */
public abstract class AbstactHandler {
    private AbstactHandler next;

    public AbstactHandler getNext() {
        return next;
    }

    public void setNext(AbstactHandler next) {
        this.next = next;
    }

    /**
     * 抽象请求方法，子类实现
     * @param request
     * @return
     */
    public abstract Boolean handle(Request request);
}
