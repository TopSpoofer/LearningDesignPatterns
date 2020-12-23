package me.spoofer.factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStory();
        try {
            Pizza pizza = pizzaStore.orderPizza("cheese");
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
    }
}
