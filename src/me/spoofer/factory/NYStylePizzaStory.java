package me.spoofer.factory;

public class NYStylePizzaStory extends PizzaStore {
    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) throws Throwable {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza(pizzaIngredientFactory);

            case "clam":
                return new NYStyleClamPizza(pizzaIngredientFactory);

            case "veggie":
                return new NYStyleVeggiePizza(pizzaIngredientFactory);

            default: //默认只吃素的，减肥
                throw new Throwable("在纽约门店您只能选择：cheese，clam，veggie 口味的pizza");
        }
    }
}
