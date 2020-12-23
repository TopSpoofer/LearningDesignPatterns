package me.spoofer.decorator;

/**
 * 浓缩咖啡类
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 19.9;
    }
}
