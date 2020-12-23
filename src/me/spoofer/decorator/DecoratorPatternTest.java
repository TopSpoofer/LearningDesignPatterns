package me.spoofer.decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Beverage espresso = new Espresso(); //先准备一杯浓缩咖啡
        System.out.println("一杯" + espresso.getDescription() + "需要" + espresso.cost() + "元");

        Beverage cafe = new Whip(new Mocha(espresso));//浓缩咖啡中加入摩卡,和奶泡
        System.out.println("一杯" + cafe.getDescription() + "需要" + cafe.cost() + "元");
    }
}
