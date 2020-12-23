package me.spoofer.factory;

/**
 * 让每个子类自己决定如何制造pizza
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) throws Throwable {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type) throws Throwable; //工厂方法移到这里，让类的实例化推到子类实现
}
