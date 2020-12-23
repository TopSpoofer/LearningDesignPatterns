package me.spoofer.adapter;

/**
 * 一只野生的火鸡
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("张开小翅膀飞啊飞啊");
    }
}
