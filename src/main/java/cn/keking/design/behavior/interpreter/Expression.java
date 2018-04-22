package cn.keking.design.behavior.interpreter;

/**
 * 抽象表达式接口定义
 */
public interface Expression {
    double interpret(Context context);
}
