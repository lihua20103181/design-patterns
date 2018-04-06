package cn.keking.design.behavior.mediator.demo;

/**
 * 租房者
 */
public class Renter {
    String name;
    Mediator mediator;

    public Renter(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void receive(String msg){
        System.out.println("租房者"+name+"接收中介信息:"+msg);
    }

    public void send(String msg) {
        System.out.println("租房者"+name+"发送信息给中介者:"+msg);
        mediator.send(this,msg);
    }
}
