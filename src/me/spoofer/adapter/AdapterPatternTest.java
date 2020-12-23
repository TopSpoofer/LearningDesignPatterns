package me.spoofer.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new WildTurkey());
        testDuck(duck);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
