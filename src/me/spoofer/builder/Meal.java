package me.spoofer.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐
 */
public class Meal {
    private final String name;
    private final List<Item> items = new ArrayList<>();

    public Meal(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item: items) {
            System.out.print(item.itemName());
            System.out.print(", 包装: " + item.packing().pack());
            System.out.println(", 价格: " + item.price());
        }
    }

    public String mealName() {
        return name;
    }
}
