package cn.keking.design.behavior.chain.demo;

public interface Filter {
    void doFilter(Request req,Response res,FilterChain filterChain);
}
