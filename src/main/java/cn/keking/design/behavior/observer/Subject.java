package cn.keking.design.behavior.observer;

import java.util.Vector;

/**
 * 主题实现
 */
public class Subject implements ISubject {
    Vector<IObserver> vector = new Vector<>();
    String data;

    @Override
    public void register(IObserver iObserver) {
        if (!vector.contains(iObserver)){
            vector.add(iObserver);
        }
    }

    @Override
    public void unregister(IObserver iObserver) {
        if (vector.contains(iObserver)) {
            vector.remove(iObserver);
        }
    }

    @Override
    public void notifyObserver() {
        vector.forEach(v ->{
            // v.refresh(data); 推数据
            // 拉数据
            v.refresh(this);
        });
    }
}
