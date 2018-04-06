package cn.keking.design.behavior.mediator.demo;

import cn.keking.design.behavior.mediator.IColleague;
import cn.keking.design.behavior.mediator.IMediator;

public class Test {
    public static void main(String[] args) {
        // 中介者
        IMediator mediator = new Mediator();
        IColleague renter1 = new Renter("006",mediator);
        IColleague renter2 = new Renter("007",mediator);
        IColleague saler = new Saler("008",mediator);
        //求租者
        mediator.addUser(renter1);
        mediator.addUser(renter2);
        // 出租者
        mediator.addUser(saler);

        renter1.send("我想租三室一厅的房子");
        renter1.send("我想租一室一厅的房子");
        saler.send("我有三室一厅的房子出租");
    }
}
