package cn.keking.design.factory.twofactory;

import cn.keking.design.factory.impls.BigBus;
import cn.keking.design.factory.impls.BigCar;
import cn.keking.design.factory.interfaces.IBus;
import cn.keking.design.factory.interfaces.ICar;

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
