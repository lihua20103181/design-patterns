package cn.keking.design.create.prototype.serializable;

import java.io.*;

/**
 * @author T-lih
 */
public class Worker implements Cloneable,Serializable {
    private String nme;
    private int age;
    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public Worker(String nme, int age, Address address) {
        this.nme = nme;
        this.age = age;
        this.address = address;
    }

    public String getNme() {
        return nme;
    }

    public void setNme(String nme) {
        this.nme = nme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
