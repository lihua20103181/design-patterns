package cn.keking.design.behavior.template.demo;

public class Test {
    public static void main(String[] args) {
        SubInteLess iLess = new SubInteLess();
        Integer[] arr = {1,88,23,28};
        Integer max = iLess.getMax(arr,iLess);
        System.out.println(max);
    }
}
