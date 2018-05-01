package cn.keking.design.structural.adapter.obj;

public class Test {
    public static void main(String[] args) {
        ThirdCommon thirdCommon = new ThirdCommon();
        IHopeInterface iHopeInterface = new HopeAdapterImpls(thirdCommon);
        iHopeInterface.hopeMethod("对象适配器");
    }
}
