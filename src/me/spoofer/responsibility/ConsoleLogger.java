package me.spoofer.responsibility;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeLog(String msg) {
        System.out.println("Standard Console::Logger: " + msg);
    }
}
