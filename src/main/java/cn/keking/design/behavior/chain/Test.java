package cn.keking.design.behavior.chain;

public class Test {
    public static void main(String[] args) {
        Request request = new Request(1);
        MyChain chain = new MyChain();
        chain.createChain();
        chain.handle(request);
    }
}
