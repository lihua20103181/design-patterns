package cn.keking.design.structural.flyweight;

public class StudInfo {
    private String name;
    private int age;
    private IFlyweight iFlyweight;

    public StudInfo(String name, int age, IFlyweight iFlyweight) {
        this.name = name;
        this.age = age;
        this.iFlyweight = iFlyweight;
    }

    @Override
    public String toString() {
        return "StudInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iFlyweight=" + iFlyweight.getUniversity() +
                '}';
    }
}
