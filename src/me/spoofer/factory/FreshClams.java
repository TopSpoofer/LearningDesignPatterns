package me.spoofer.factory;

public class FreshClams implements Clams {
    private String name;

    public FreshClams() {
        this.name = "新鲜的哈利";
    }

    @Override
    public String getName() {
        return name;
    }
}
