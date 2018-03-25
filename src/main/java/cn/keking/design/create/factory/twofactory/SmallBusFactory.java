package cn.keking.design.create.factory.twofactory;

import cn.keking.design.create.factory.impls.SmallBus;
import cn.keking.design.create.factory.impls.SmallCar;
import cn.keking.design.create.factory.interfaces.IBus;
import cn.keking.design.create.factory.interfaces.ICar;

public class SmallBusFactory extends AbstractFactory2 {
    @Override
    public IBus create2() {
        return new SmallBus();
    }

    @Override
    public ICar create() {
        return new SmallCar();
    }
}
