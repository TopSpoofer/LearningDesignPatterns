package me.spoofer.builder;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal("蔬菜汉堡套餐");
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChicken() {
        Meal meal = new Meal("鸡肉汉堡套餐");
        meal.addItem(new ChickenBurger());
        meal.addItem(new Sprite());
        return meal;
    }
}
