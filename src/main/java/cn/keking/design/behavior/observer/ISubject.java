package cn.keking.design.behavior.observer;

/**
 * 主题接口
 */
public interface ISubject<T> {
    /**
     * 注册观察者
     * @param iObserver
     */
    void register(IObserver<T> iObserver);

    /**
     * 撤销观察者
     * @param iObserver
     */
    void unregister(IObserver<T> iObserver);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
