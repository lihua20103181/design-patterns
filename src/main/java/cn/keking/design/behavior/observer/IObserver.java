package cn.keking.design.behavior.observer;

/**
 * 观察者接口
 */
public interface IObserver<T> {
    void refresh(T data);
}
