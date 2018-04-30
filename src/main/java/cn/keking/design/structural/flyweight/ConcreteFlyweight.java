package cn.keking.design.structural.flyweight;

/**
 * 具体享元角色
 */
public class ConcreteFlyweight implements IFlyweight {
    private String university;
    private String city;
    private String province;
    /**
     * 构造方法创建享元对象
     * @param university
     * @param city
     * @param province
     */
    public ConcreteFlyweight(String university, String city, String province) {
        this.university = university;
        this.city = city;
        this.province = province;
    }

    @Override
    public String getUniversity() {
        return university;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getProvince() {
        return province;
    }
}
