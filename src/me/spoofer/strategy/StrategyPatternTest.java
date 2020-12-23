package me.spoofer.strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Duck coleDuck = new ColeDuck();
        coleDuck.display();
        coleDuck.Swim();
        coleDuck.fly();

        coleDuck.setFlyBehavior(new FlyByPropellerEngine());
        coleDuck.fly();
    }
}
