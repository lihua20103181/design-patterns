package cn.keking.design.behavior.command;

public class Test {

    public static void main(String[] args) {
        // 命令管理者
        CommandManage manage = new CommandManage();
        // 命令接收者
        Receiver receiver = new Receiver();
        // 命令发送者
        ConcreteCommander concreteCommander = new ConcreteCommander(receiver);
        // 加入命令管理者
        manage.add(concreteCommander);
        // 执行命令
        manage.executeCommand();
    }
}