package me.spoofer.command;

public class CommandPatternTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand cmd = new LightOnCommand(light);
        remote.setCommand(cmd);
        remote.buttonWasPressed();
    }
}
