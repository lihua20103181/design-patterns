package cn.keking.design.create.prototype.cloneable;

/**
 * 克隆创建原型模式
 * @author T-lih
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("pro","city","zip");
        Worker worker = new Worker("name",18,address);
        // 克隆对象
        Worker worker2 = (Worker)worker.clone();
        System.out.println(worker+"=====>"+worker2);
        // 浅复制是地址相同 深复制地址不同
        System.out.println(worker.getAddress()+"=====>"+worker2.getAddress());
        System.out.println(worker.getNme()+"=====>"+worker2.getNme());
        System.out.println(worker.getAddress().getPro()+"=====>"+worker2.getAddress().getPro());
    }
}
