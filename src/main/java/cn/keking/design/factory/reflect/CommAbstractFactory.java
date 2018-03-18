package cn.keking.design.factory.reflect;

/**
 * 泛型+反射实现通用工厂
 * @author T-lih
 * @param <T>
 */
public class CommAbstractFactory <T> {
    public T create(String className) {
        T t = null;
        try {
            Class clazz = Class.forName(className);
            t = (T)clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
