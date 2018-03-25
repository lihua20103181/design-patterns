package cn.keking.design.create.build.type;

import cn.keking.design.create.build.Product;

/**
 * 泛型实现生成器模式
 */
public class ProductBuild1 implements IBuild<Product> {

    @Override
    public void createUnit() {

    }

    @Override
    public Product create() {
        return null;
    }
}
