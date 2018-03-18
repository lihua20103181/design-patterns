package cn.keking.design.factory.twofactory;

import cn.keking.design.factory.interfaces.IBus;
import cn.keking.design.factory.interfaces.ICar;
import cn.keking.design.factory.onefactory.AbstractFactory;

/**
 * 多产品抽象工厂
 * @author T-lih
 */
public abstract class AbstractFactory2 extends AbstractFactory {
    public abstract IBus create2();
}
