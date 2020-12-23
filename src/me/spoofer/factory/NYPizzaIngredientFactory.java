package me.spoofer.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new NYSweetCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Lettuce() };
    }
}
