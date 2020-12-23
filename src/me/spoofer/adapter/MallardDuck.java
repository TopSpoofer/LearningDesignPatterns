package me.spoofer.adapter;

/**
 * 绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("哒哒哒叫");
    }

    @Override
    public void fly() {
        System.out.println("小翅膀噗呲噗呲地飞啊");
    }
}
