package cn.keking.design.behavior.mediator.demo;

/**
 * 出租者
 */
public class Saler {
    String name;
    Mediator mediator;

    public Saler(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void receive(String msg){
        System.out.println("出租者"+name+"接收中介信息："+msg);
    }
    public void send(String msg) {
        System.out.println("出租者"+name+"发送信息给中介者:"+msg);
        mediator.send(this,msg);
    }
}
