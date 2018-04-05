package cn.keking.design.behavior.visitor;

public class ElementImpl implements IElement {
    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }

    @Override
    public Object extendFunc(IVisitor iVisitor) {
        return iVisitor.visit(this);
    }

    @Override
    public Object extendFun(IVisitor iVisitor, String method) {
        return iVisitor.visit(this,method);
    }
}
