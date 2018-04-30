package cn.keking.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {
    private FlyweightFactory(){}
    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private Map<String,IFlyweight> map = new HashMap();

    public synchronized static FlyweightFactory getInstance() {
        return flyweightFactory;
    }
    public void addFlyweight(String key,IFlyweight iFlyweight) {
        map.put(key,iFlyweight);
    }
    public synchronized IFlyweight getFlyweight(String key){
        return map.get(key);
    }
}
