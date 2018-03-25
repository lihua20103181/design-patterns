package cn.keking.design.create.prototype.constructor;

/**
 * 构造方法创建原型模式
 * @author T-lih
 */
public class Test {
    public static void main(String[] args) {
        Address address = new Address("pro","city","zip");
        Worker worker = new Worker("name",18,address);

        // 构造方法 以worker为原型，建立复制对象worker2
        Worker worker2 = new Worker(worker);

        System.out.println(worker+"=====>"+worker2);
        // 浅复制是地址相同 深复制地址不同
        System.out.println(worker.getAddress()+"=====>"+worker2.getAddress());
        System.out.println(worker.getNme()+"=====>"+worker2.getNme());
        System.out.println(worker.getAddress().getPro()+"=====>"+worker2.getAddress().getPro());
    }
}
