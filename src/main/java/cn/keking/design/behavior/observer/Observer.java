package cn.keking.design.behavior.observer;

public class Observer implements IObserver<ISubject> {
    @Override
    public void refresh(ISubject data) {
        Subject subject = (Subject) data;
        System.out.println("收到数据:"+subject.data);
    }
}
