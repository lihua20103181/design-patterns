package cn.keking.design.create.build;

/**
 * 生成器接口
 * @author T-lih
 */
public interface IBuild {
    /**
     * 创建单元1
     */
    void createUnit1();

    /**
     * 创建单元2
     */
    void createUnit2();

    /**
     * 创建实例
     * @return
     */
    Product create();
    /**
     * 组合对象
     * @return
     */
    Product composite();

}
