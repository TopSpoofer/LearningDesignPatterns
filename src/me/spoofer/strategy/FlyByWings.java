package me.spoofer.strategy;

public class FlyByWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀噗嗤噗嗤地飞");
    }
}
