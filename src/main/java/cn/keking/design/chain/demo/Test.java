package cn.keking.design.chain.demo;

/**
 * 将字符串转化为大写和去除空格
 */
public class Test {
    public static void main(String[] args) {
        Request req = new Request("this is a test");
        Response res = new Response("");
        Filter one = new OneFilter();
        Filter two = new TwoFilter();
        FilterChain chain = new FilterChain();
        chain.addFilter(one);
        chain.addFilter(two);
        chain.doFilter(req,res,chain);
        System.out.println(res.res);
    }
}
