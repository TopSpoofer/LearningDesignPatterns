package me.spoofer.decorator;

/**
 * 抽血的饮料类
 */
public abstract class Beverage {
    String description = "未知的饮料";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
