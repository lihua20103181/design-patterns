package cn.keking.design.create.prototype.serializable;

import java.io.Serializable;

/**
 * @author T-lih
 */
public class Address  implements Serializable{
    private String pro;
    private String city;
    private String zip;
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
