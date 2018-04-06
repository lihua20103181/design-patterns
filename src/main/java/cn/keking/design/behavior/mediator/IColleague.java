package cn.keking.design.behavior.mediator;

/**
 * 抽象同事接口
 * 具体同事需要实现的方法
 */
public interface IColleague {
    /**
     * 接收信息
     * @param msg
     */
    void receive(String msg);

    /**
     * 发送信息
     * @param msg
     */
    void send(String msg);
}
