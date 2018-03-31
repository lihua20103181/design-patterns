package cn.keking.design.chain.demo;

public class TwoFilter implements Filter {
    @Override
    public void doFilter(Request req, Response res, FilterChain filterChain) {
        String str = res.res;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                sb.append(c);
            }
        }
        res.res = sb.toString();
        filterChain.doFilter(req,res,filterChain);
    }
}
