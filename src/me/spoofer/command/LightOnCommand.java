package me.spoofer.command;

public class LightOnCommand implements Command {
    Light light; //灯可以有很多种，可以是吸顶灯，可以是吊灯等，最好是一个接口

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
