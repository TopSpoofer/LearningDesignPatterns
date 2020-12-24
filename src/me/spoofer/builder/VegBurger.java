package me.spoofer.builder;

/**
 * 蔬菜汉堡包
 */
public class VegBurger extends Burger {
    @Override
    public String itemName() {
        return "蔬菜汉堡包";
    }

    @Override
    public float price() {
        return 19.9f;
    }
}
