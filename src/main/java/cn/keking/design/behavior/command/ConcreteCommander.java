package cn.keking.design.behavior.command;

/**
 * 具体命令发送者
 */
public class ConcreteCommander implements ICommander{
    Receiver receiver;
    public ConcreteCommander(Receiver receiver) {
        this.receiver = receiver;
    }
    public void exce() {
        receiver.exce();
    }
}
