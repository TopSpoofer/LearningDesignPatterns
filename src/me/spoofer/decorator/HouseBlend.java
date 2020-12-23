package me.spoofer.decorator;

/**
 * 综合咖啡类
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "综合咖啡类";
    }

    @Override
    public double cost() {
        return 8.8;
    }
}
