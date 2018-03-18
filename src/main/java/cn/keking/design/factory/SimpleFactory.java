package cn.keking.design.factory;

import cn.keking.design.factory.impls.BigCar;
import cn.keking.design.factory.impls.SmallCar;
import cn.keking.design.factory.interfaces.ICar;

/**
 * 简单工厂模式
 * @author T-lih
 */
public class SimpleFactory {

    public static final String BIG_CAR = "bigCar";
    public static final String SMALL_CAR = "smallCar";

    public static ICar create(String type) {
        ICar iCar = null;
        switch (type) {
            case BIG_CAR:
                iCar = new BigCar();
                break;
            case SMALL_CAR:
                iCar = new SmallCar();
                break;
            default:
                break;
        }
        return iCar;
    }

    public static void main(String[] args) {
        ICar iCar = SimpleFactory.create(BIG_CAR);
    }
}
