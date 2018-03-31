package cn.keking.design.chain;

/**
 * 生成责任链关系
 */
public class MyChain {
    private AbstactHandler firstHandler = new FirstHandler();
    private AbstactHandler secondHandler = new SecondHandler();
    private AbstactHandler lastHandler = new LastHandler();
    public void createChain() {
        firstHandler.setNext(secondHandler);
        secondHandler.setNext(lastHandler);
    }
    public void handle(Request request) {
        firstHandler.handle(request);
    }
}
