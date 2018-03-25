package cn.keking.design.create.factory.onefactory;

import cn.keking.design.create.factory.interfaces.ICar;

public class FactoryTest {
    public static void main(String[] args) {
        // 多态创建工厂
        AbstractFactory abstractFactory = new BigCarFactory();
        ICar iCar = abstractFactory.create();
    }
}
