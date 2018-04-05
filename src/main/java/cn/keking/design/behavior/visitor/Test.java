package cn.keking.design.behavior.visitor;

public class Test {
    public static void main(String[] args) {
        IVisitor iVisitor = new VisitorImpl();
        IElement func = new ElementImpl();
        func.extendFunc(iVisitor);

        func.extendFun(iVisitor,"getFun");
    }
}
