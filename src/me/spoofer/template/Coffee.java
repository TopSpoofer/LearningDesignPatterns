package me.spoofer.template;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("咖啡粉倒进开水了，勺子搅拌一下");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
