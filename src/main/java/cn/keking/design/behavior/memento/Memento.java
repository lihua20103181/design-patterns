package cn.keking.design.behavior.memento;

import java.io.Serializable;

/**
 * 备忘录
 */
public class Memento implements Serializable{
    /**
     * 将原发者属性定义为变量
     */
    private int pos;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
