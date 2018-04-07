package cn.keking.design.behavior.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * jdk 观察者模式主题
 */
public class Subject extends Observable {
    private String data;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        // 设置标识变量
        this.setChanged();
        // 形参的设定arg,可以将一些参数传递给观察者
        this.notifyObservers("测试参数");;
    }
}
