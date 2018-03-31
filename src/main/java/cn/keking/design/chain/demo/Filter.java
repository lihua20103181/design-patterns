package cn.keking.design.chain.demo;

public interface Filter {
    void doFilter(Request req,Response res,FilterChain filterChain);
}
