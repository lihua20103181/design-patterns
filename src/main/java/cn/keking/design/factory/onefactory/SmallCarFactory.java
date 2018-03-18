package cn.keking.design.factory.onefactory;

import cn.keking.design.factory.impls.SmallCar;
import cn.keking.design.factory.interfaces.ICar;
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
