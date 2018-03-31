package cn.keking.design.chain;

/**
 * 第一个处理者
 */
public class FirstHandler extends AbstactHandler{
    private static final Integer first = 1;
    @Override
    public Boolean handle(Request request) {
        if (request.day == first) {
            return true;
        }
        return getNext().handle(request);
    }
}
