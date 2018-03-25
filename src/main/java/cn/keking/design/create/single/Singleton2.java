package cn.keking.design.create.single;

import java.util.Scanner;

/**
 * 延迟实例化
 * author:T-lih
 */
public class Singleton2 {
    private Singleton2(){
        System.out.println("新实例");
    }
    private static Singleton2 singleton2 = null;

    /**
     * 该方法存在线程安全问题，会产生两个实例 (三种方式解决，如下：1,2,3)
     * @return
     */
    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    /**
     * 1、完全同步方法
     * @return
     */
    public static synchronized Singleton2 getInstanceByMethodSyn() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    /**
     *2、 部分同步方法
     * @return
     */
    public static Singleton2 getInstanceByPartMethodSyn() {
        // 双重锁部分同步机制
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    /**
     * 3、静态内部类实现单例
     */
    private static class Inner{
        private static final Singleton2 SINGLETON_2 = new Singleton2();
    }

    public static final Singleton2 getInstanceByStaticInner(){
        // 该对象是线程安全的
        return Inner.SINGLETON_2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        scanner.nextLine();
        Singleton2 singleton2 = getInstanceByPartMethodSyn();
        Singleton2 singleton21 = getInstanceByPartMethodSyn();
    }
}
