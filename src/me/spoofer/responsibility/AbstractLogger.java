package me.spoofer.responsibility;

public abstract class AbstractLogger {
    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int WARNING = 3;
    public static int ERROR = 4;

    protected int level;
    //下一个责任人
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
    }

    public void logMessage(int level, String msg) {
        if (this.level <= level) {
            writeLog(msg);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, msg);
        }
    }

    abstract protected void writeLog(String msg);
}
