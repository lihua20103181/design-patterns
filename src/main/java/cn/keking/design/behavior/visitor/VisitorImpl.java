package cn.keking.design.behavior.visitor;

import java.lang.reflect.Method;

/**
 *实现访问者接口
 */
public class VisitorImpl implements IVisitor  {
    @Override
    public Object visit(Object targ) {
        System.out.println("访问者===");
        return null;
    }

    @Override
    public Object visit(Object targ, String method) {
        Object object = null;
        Class cla = this.getClass();
        try {
            Method md = cla.getDeclaredMethod(method);
            //Method md = cla.getMethod(method);
            object = md.invoke(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    public void getFun() {
        System.out.println("测试反射技术实现访问者");
    }

}
