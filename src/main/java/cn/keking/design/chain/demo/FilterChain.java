package cn.keking.design.chain.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成过滤器集合对象，实现回调功能
 */
public class FilterChain implements Filter {
    List<Filter> list = new ArrayList<>();
    int index = 0;
    void addFilter(Filter filter) {
        list.add(filter);
    }
    @Override
    public void doFilter(Request req, Response res, FilterChain filterChain) {
        if (index == list.size()) {
            return;
        }
        Filter filter = list.get(index);
        index ++;
        filter.doFilter(req,res,filterChain);
    }
}
