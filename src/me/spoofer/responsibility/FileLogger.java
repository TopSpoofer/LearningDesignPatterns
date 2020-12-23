package me.spoofer.responsibility;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeLog(String msg) {
        System.out.println("File::Logger: " + msg);
    }
}
