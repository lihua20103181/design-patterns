package cn.keking.design.behavior.template.demo;

/**
 * 子类实现各自行为
 */
public class SubInteLess extends AbstractComm<Integer> {
    @Override
    public boolean less(Integer x, Integer y) {
        return x < y;
    }
}
