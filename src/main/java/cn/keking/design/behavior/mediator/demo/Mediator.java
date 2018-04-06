package cn.keking.design.behavior.mediator.demo;

import cn.keking.design.behavior.mediator.IColleague;
import cn.keking.design.behavior.mediator.IMediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者
 */
public class Mediator implements IMediator {
    Map<String,Renter> renterMap = new HashMap<>();
    Map<String,Saler> salerMap = new HashMap<>();

    public void addRenter(Renter renter) {
        renterMap.put(renter.name,renter);
    }
    public void addSaler(Saler saler) {
        salerMap.put(saler.name,saler);
    }

    /**
     * 接收 租房者信息，并广播给出租者
     * @param renter
     * @param msg
     */
    public void sendRenter(Renter renter,String msg) {
        System.out.println("收到来自租房者:"+renter.name+"信息，并广播给，出租者");
        salerMap.keySet().forEach(key->{
            Saler saler = salerMap.get(key);
            saler.receive(renter.name+"："+msg);
        });
    }

    /**
     * 接收出租者信息并广播给租房者
     * @param saler
     * @param msg
     */
    public void sendSaler(Saler saler,String msg) {
        System.out.println("收到来出租者:"+saler.name+"信息，并广播给租房者");
        renterMap.keySet().forEach(key->{
            Renter renter = renterMap.get(key);
            renter.receive(saler.name+":"+msg);
        });
    }

    @Override
    public void addUser(IColleague iColleague) {
        if (iColleague instanceof Renter) {
            this.addRenter((Renter) iColleague);
        }
        if (iColleague instanceof Saler) {
            this.addSaler((Saler) iColleague);
        }
    }

    @Override
    public void send(IColleague iColleague, String msg) {
        if (iColleague instanceof Renter) {
            this.sendRenter((Renter)iColleague,msg);
        }
        if (iColleague instanceof Saler) {
            this.sendSaler((Saler)iColleague,msg);
        }
    }
}
