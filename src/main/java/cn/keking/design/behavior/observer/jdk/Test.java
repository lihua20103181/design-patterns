package cn.keking.design.behavior.observer.jdk;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        // 观察者
        Observer observer = new ObserverImpl();
        // 主题
        Subject subject = new Subject();
        subject.addObserver(observer);
        subject.setData("321");
    }
}
