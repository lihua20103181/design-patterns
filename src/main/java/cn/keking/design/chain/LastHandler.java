package cn.keking.design.chain;

/**
 * 最后处理者
 */
public class LastHandler extends AbstactHandler{
    @Override
    public Boolean handle(Request request) {
       return true;
    }
}
