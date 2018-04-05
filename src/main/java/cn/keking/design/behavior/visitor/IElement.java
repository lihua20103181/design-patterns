package cn.keking.design.behavior.visitor;

/**
 * 若增加一个方法功能就要新增一个方法实现（访问者解决）
 */
interface IElement {
    void func1();
    void func2();
    void func3();

    /**
     * 可扩展的方法
     * @param iVisitor
     * @return
     */
    Object extendFunc(IVisitor iVisitor);

    /**
     * 反射实现多访问具体访问
     * @param iVisitor
     * @param method
     * @return
     */
    Object extendFun(IVisitor iVisitor,String method);
}
