package cn.keking.design.structural.adapter.obj;

/**
 * 对象适配器
 */
public class HopeAdapterImpls implements IHopeInterface {
    ThirdCommon thirdCommon;

    public HopeAdapterImpls(ThirdCommon thirdCommon) {
        this.thirdCommon = thirdCommon;
    }

    @Override
    public String hopeMethod(String str) {
        return thirdCommon.realMethod(str);
    }
}
