package cn.keking.design.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 存储解释器之外的一些全局信息，通常它临时存储了需要解释的语句。
 */
public class Context {
    Map<String,Double> map = new HashMap<>();
    void assign(String key,double value) {
        map.put(key,value);
    }
}
