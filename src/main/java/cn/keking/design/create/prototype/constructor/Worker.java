package cn.keking.design.create.prototype.constructor;

/**
 * @author T-lih
 */
public class Worker {
    private String nme;
    private int age;
    private Address address;

    public Worker(Worker worker) {
        nme = worker.getNme();
        age = worker.getAge();
        // 浅复制，只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制
        //address = worker.getAddress();
        // 深复制
        address = new Address(worker.getAddress());
    }
    //constructor
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
