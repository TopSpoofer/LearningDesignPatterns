package me.spoofer.factory;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.name = "NYStyleCheesePizza";
    }

    @Override
    void prepare() {
        System.out.println("正在准备" + name);
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        System.out.println(getIngredient());
    }
}
