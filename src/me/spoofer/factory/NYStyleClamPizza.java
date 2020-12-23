package me.spoofer.factory;

public class NYStyleClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = "NYStyleClamPizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("正在准备" + name);
        clam = pizzaIngredientFactory.createClams();
        veggies = pizzaIngredientFactory.createVeggies();
        System.out.println(getIngredient());
    }
}
