package me.spoofer.factory;

public class NYStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = "NYStyleVeggiePizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("正在准备" + name);
        veggies = pizzaIngredientFactory.createVeggies();
        System.out.println(getIngredient());
    }
}
