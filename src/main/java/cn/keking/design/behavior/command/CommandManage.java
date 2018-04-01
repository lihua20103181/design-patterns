package cn.keking.design.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令管理者（请求者）
 */
public class CommandManage {
    List<ICommander> list = new ArrayList<>();

    public void add(ICommander iCommander) {
        list.add(iCommander);
    }

    public void executeCommand() {
        list.forEach(iCommander -> {
            // 执行命令
            iCommander.exce();
        });
    }
}
