package cn.keking.design.single;

/**
 * 直接实例化创建单例模式
 * author:T-lih
 */
public class Singleton1 {
    private Singleton1(){}
    private static final Singleton1 SINGLETON_1 = new Singleton1();
    public static Singleton1 getInstance() {
        return SINGLETON_1;
    }
}
