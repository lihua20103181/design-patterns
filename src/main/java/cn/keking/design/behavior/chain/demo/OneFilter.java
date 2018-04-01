package cn.keking.design.behavior.chain.demo;

public class OneFilter implements Filter {
    @Override
    public void doFilter(Request req, Response res, FilterChain filterChain) {
        String str = req.req;
        res.res = str.toUpperCase();
        filterChain.doFilter(req,res,filterChain);
    }
}
