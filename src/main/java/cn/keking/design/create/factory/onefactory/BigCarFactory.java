package cn.keking.design.create.factory.onefactory;

import cn.keking.design.create.factory.impls.BigCar;
import cn.keking.design.create.factory.interfaces.ICar;

/**
 * BigCar 工厂
 * @author T-lih
 */
public class BigCarFactory extends AbstractFactory {
    @Override
    public ICar create() {
        return new BigCar();
    }
}
