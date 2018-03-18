package cn.keking.design.factory.reflect;

import cn.keking.design.factory.interfaces.ICar;

/**
 * 反射实现工厂
 * @author T-lih
 */
public abstract class AbstractFactoryByReflect {
    public abstract ICar create();

    static AbstractFactoryByReflect create(String className) {
        AbstractFactoryByReflect factory = null;
        try {
            Class clazz = Class.forName(className);
            factory = (AbstractFactoryByReflect) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
}
