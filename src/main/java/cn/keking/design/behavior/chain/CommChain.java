package cn.keking.design.behavior.chain;

/**
 * 配置+反射实现责任链
 */
public class CommChain {
    private AbstactHandler handler[];
    public void createChain() throws Exception{
        // 有n个处理类 度配置文件确定n,
        // TODO 读取反射类
        int n = 10;
        String className[] = new String[n];
        handler = new AbstactHandler[n];
        // 反射生成实例
        for (int i=0;i<n;i++) {
            handler[i] = (AbstactHandler) Class.forName(className[i]).newInstance();
        }
        // 设置下一个节点
        for (int i=0;i<n-1;i++) {
            handler[i].setNext(handler[i+1]);
        }

    }

    public void handle(Request request) {
        handler[0].handle(request);
    }
}
