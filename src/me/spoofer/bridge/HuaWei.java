package me.spoofer.bridge;

public class HuaWei extends Phone {
    public HuaWei(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void buyPhone() {
        System.out.println("购买了华为" + memory.getMemory() + "手机");
    }
}
