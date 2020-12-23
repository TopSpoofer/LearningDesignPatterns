package me.spoofer.factory;

public class Lettuce implements Veggies {
    public String name;

    public Lettuce() {
        this.name = "生菜";
    }

    @Override
    public String getName() {
        return name;
    }
}
