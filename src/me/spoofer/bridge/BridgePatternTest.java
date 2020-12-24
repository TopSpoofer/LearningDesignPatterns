package me.spoofer.bridge;

public class BridgePatternTest {
    public static void main(String[] args) {
        Phone phone = new HuaWei(new Memory4G());
        phone.buyPhone();

        Phone mi = new Mi(new Memory8G());
        mi.buyPhone();
    }
}
