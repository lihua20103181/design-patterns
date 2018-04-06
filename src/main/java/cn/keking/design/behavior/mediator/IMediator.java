package cn.keking.design.behavior.mediator;

import cn.keking.design.behavior.mediator.demo.Renter;
import cn.keking.design.behavior.mediator.demo.Saler;

/**
 * 抽象中介者,定义同事之间通讯的方法
 */
public interface IMediator {
    /**
     * 通知同事
     * @param iColleague
     * @param msg
     */
    void send(IColleague iColleague, String msg);
    void addUser(IColleague iColleague);
}
