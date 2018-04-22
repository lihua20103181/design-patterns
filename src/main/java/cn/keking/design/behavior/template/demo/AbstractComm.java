package cn.keking.design.behavior.template.demo;

/**
 * 抽象公共部分
 * @param <T>
 */
public abstract class AbstractComm<T> {
    public T getMax(T[] t,AbstractComm<T> cmp) {
        T maxValue = t[0];
        for (int i = 0; i < t.length; i++) {
            if (cmp.less(maxValue,t[i])) {
                maxValue = t[i];
            }
        }
        return maxValue;
    }

    abstract boolean less(T x,T y);
}
