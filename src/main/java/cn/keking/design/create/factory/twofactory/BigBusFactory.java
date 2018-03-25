package cn.keking.design.create.factory.twofactory;

import cn.keking.design.create.factory.impls.BigBus;
import cn.keking.design.create.factory.impls.BigCar;
import cn.keking.design.create.factory.interfaces.IBus;
import cn.keking.design.create.factory.interfaces.ICar;

public class BigBusFactory extends AbstractFactory2 {
    @Override
    public IBus create2() {
        return new BigBus();
    }
    @Override
    public ICar create() {
        return new BigCar();
    }
}
