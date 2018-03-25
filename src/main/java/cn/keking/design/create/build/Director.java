package cn.keking.design.create.build;

/**
 * 定义统一调度类（指挥者）
 * @author T-lih
 */
public class Director {
    private IBuild iBuild;
    public Director(IBuild iBuild) {
        this.iBuild = iBuild;
    }

    /**
     * 组合创建对象
     * @return
     */
    public Product build(){
        iBuild.createUnit1();
        iBuild.createUnit2();
        return iBuild.composite();
    }

    /**
     * 创建对象的第二种方式
     * @return
     */
    public Product build2() {
        return iBuild.create();
    }

    public static void main(String[] args) {
        IBuild iBuild = new ProductBuild1();
        Director director = new Director(iBuild);
        director.build();
    }

}
