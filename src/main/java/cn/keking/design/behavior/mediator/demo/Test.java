package cn.keking.design.behavior.mediator.demo;

public class Test {
    public static void main(String[] args) {
        // 中介者
        Mediator mediator = new Mediator();
        Renter renter1 = new Renter("006",mediator);
        Renter renter2 = new Renter("007",mediator);
        Saler saler = new Saler("008",mediator);
        //求租者
        mediator.addRenter(renter1);
        mediator.addRenter(renter2);
        // 出租者
        mediator.addSaler(saler);

        renter1.send("我想租三室一厅的房子");
        renter1.send("我想租一室一厅的房子");
        saler.send("我有三室一厅的房子出租");
    }
}
