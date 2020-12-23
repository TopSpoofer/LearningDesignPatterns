package me.spoofer.factory;

public class NYSweetCheese implements Cheese {
    private String name;
    private String taste;

    public NYSweetCheese() {
        this.name = "NYSweetCheese";
        this.taste = "甜的";
    }

    @Override
    public String getTaste() {
        return taste;
    }

    @Override
    public String getName() {
        return name;
    }
}
