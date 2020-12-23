package me.spoofer.factory;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Clams createClams();
    public Veggies[] createVeggies();
}
