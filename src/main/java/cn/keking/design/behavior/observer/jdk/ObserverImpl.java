package cn.keking.design.behavior.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 *
 */
public class ObserverImpl implements Observer {
    /**
     * jdk 自带的 观察者
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        Subject subject = (Subject) o;
        // 拉数据
        System.out.println(arg);
        System.out.println("获取的数据:"+subject.getData());
    }
}
