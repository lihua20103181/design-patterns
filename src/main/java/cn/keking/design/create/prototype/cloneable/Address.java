package cn.keking.design.create.prototype.cloneable;

/**
 * @author T-lih
 */
public class Address implements Cloneable{
    private String pro;
    private String city;
    private String zip;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Address(String pro, String city, String zip) {
        this.pro = pro;
        this.city = city;
        this.zip = zip;
    }
    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
