package cn.keking.design.behavior.chain;

/**
 * 最后处理者
 */
public class LastHandler extends AbstactHandler{
    @Override
    public Boolean handle(Request request) {
       return true;
    }
}
