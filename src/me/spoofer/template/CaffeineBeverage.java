package me.spoofer.template;

public abstract class CaffeineBeverage {
    /**
     * 这个就是封装了算法的模板方法
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        //这里还可以实现一些钩子
        hook();
    }

    /**
     * 冲泡
     */
    protected abstract void brew();

    /**
     * 加入调料
     */
    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("烧开水");
    }

    private void pourInCup() {
        System.out.println("倒进杯子里");
    }

    protected void hook() {
        //如果子类想实现额外的步骤（算法），可以覆盖这个方法，在这里实现
    }
}
