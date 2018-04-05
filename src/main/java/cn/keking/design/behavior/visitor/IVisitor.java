package cn.keking.design.behavior.visitor;

public interface IVisitor<T> {
    Object visit(T targ);

    /**
     * 反射实现多方法具体访问
     * @param targ
     * @param methhod
     * @return
     */
    Object visit(T targ,String methhod);
}
