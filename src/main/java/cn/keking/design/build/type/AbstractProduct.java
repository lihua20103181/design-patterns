package cn.keking.design.build.type;

/**
 * 抽象生成器类
 */
public abstract class AbstractProduct {
    Object obj1;
    Object obj2;
    abstract void createObj1();
    abstract void createObj2();
    abstract void composite();
}
