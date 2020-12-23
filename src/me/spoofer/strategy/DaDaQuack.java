package me.spoofer.strategy;

public class DaDaQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("哒哒哒~~~");
    }
}
