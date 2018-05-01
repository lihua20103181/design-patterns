package cn.keking.design.structural.adapter.clazz;

import cn.keking.design.structural.adapter.obj.IHopeInterface;
import cn.keking.design.structural.adapter.obj.ThirdCommon;

/**
 * 类适配器
 */
public class ClazzAdapter extends ThirdCommon implements IHopeInterface {
    @Override
    public String hopeMethod(String str) {
        return realMethod(str);
    }
}
