package cn.keking.design.build.type;

/**
 * 泛型实现生成器接口
 * @author T-lih
 * @param <T>
 */
public interface IBuild<T> {
    void createUnit();
    T create();
}
