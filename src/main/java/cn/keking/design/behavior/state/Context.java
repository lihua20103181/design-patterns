package cn.keking.design.behavior.state;

/**
 * 事物类/上下文类，定义多态状态接口，维护一个具体处理当前状态的实例对象
 */
public class Context {
    private IState iState;

    /**
     * 根据条件来选择状态
     */
    public void manage() {
        iState.goState();
    }
}
