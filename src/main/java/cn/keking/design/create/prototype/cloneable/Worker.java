package cn.keking.design.create.prototype.cloneable;

/**
 * @author T-lih
 */
public class Worker implements Cloneable{
    private String nme;
    private int age;
    private Address address;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅复制
        //return super.clone();
        // 深复制
        Worker worker = (Worker) super.clone();
        worker.setAddress((Address) address.clone());
        return worker;
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
