package me.spoofer.bridge;

public class Mi extends Phone {
    public Mi(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void buyPhone() {
        System.out.println("购买了小米" + memory.getMemory() + "手机");
    }
}
