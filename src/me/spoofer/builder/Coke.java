package me.spoofer.builder;

public class Coke extends ColdDrink{
    @Override
    public String itemName() {
        return "可乐";
    }

    @Override
    public float price() {
        return 9.9f;
    }
}
