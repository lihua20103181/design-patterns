package cn.keking.design.create.factory.onefactory;

import cn.keking.design.create.factory.impls.SmallCar;
import cn.keking.design.create.factory.interfaces.ICar;
/**
 * BigCar 工厂
 * @author T-lih
 */
public class SmallCarFactory extends AbstractFactory {
    @Override
    public ICar create() {
        return new SmallCar();
    }
}
