package me.spoofer.builder;

/**
 * 鸡肉汉堡包
 */
public class ChickenBurger extends Burger {
    @Override
    public String itemName() {
        return "鸡肉汉堡包";
    }

    @Override
    public float price() {
        return 25.3f;
    }
}
