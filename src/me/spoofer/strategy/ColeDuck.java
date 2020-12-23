package me.spoofer.strategy;

/**
 * 柯尔鸭的实现
 */
public class ColeDuck extends Duck {
    public ColeDuck() {
        this.flyBehavior = new FlyByWings();
        this.quackBehavior = new DaDaQuack();
        this.name = "柯尔鸭";
    }

    @Override
    public void display() {
        System.out.println(name + "是黄嘴巴、大眼睛、大胸脯、矮胖胖");
    }
}
