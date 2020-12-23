package me.spoofer.strategy;

public class FlyByPropellerEngine implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用螺旋桨飞啊~~");
    }
}
