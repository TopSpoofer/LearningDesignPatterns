package me.spoofer.builder;

public class BuilderPatternTest {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal = builder.prepareVegMeal();
        System.out.println(meal.mealName() + "价格：" + meal.getCost());
        System.out.println(meal.mealName() + "清单：");
        meal.showItems();
    }
}
