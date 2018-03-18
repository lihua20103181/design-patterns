package cn.keking.design.build;

/**
 * 生成器1
 */
public class ProductBuild1 implements IBuild {
    /**
     * 成员变量
     */
    Product product = new Product();
    @Override
    public void createUnit1() {

    }

    @Override
    public void createUnit2() {

    }

    @Override
    public Product create() {
        createUnit1();
        createUnit2();
        return composite();
    }

    /**
     * 关联createUnit1和createUnit2创建的对象
     * @return
     */
    @Override
    public Product composite() {
        return product;
    }
}
