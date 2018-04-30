package cn.keking.design.structural.flyweight;

public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        IFlyweight iFlyweight = new ConcreteFlyweight("1","2","3");
        flyweightFactory.addFlyweight("one",iFlyweight);
        IFlyweight obj = flyweightFactory.getFlyweight("one");
        StudInfo studInfo = new StudInfo("test",18,obj);
        System.out.println(studInfo.toString());
    }
}
