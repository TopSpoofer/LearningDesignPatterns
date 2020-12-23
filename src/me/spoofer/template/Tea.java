package me.spoofer.template;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("90度水慢慢冲泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬片");
    }
}
