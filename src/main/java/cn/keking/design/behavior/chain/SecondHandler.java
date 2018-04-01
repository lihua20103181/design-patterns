package cn.keking.design.behavior.chain;

/**
 * 第二个处理者
 */
public class SecondHandler extends AbstactHandler{
    private static final Integer second = 1;
    @Override
    public Boolean handle(Request request) {
        if (request.day == second) {
            return true;
        }
        return getNext().handle(request);
    }
}
