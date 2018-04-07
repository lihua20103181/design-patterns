package cn.keking.design.behavior.observer;

public class Test {
    public static void main(String[] args) {
        // 主题
        Subject subject = new Subject();
        // 观察者
        IObserver observer = new Observer();
        subject.data = "hello word.";
        subject.register(observer);
        subject.notifyObserver();
    }
}
