package me.spoofer.responsibility;

public class ResponsibilityChainPatternTest {
    public static void main(String[] args) {
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        consoleLogger.setNextLogger(fileLogger);

        LoggerProxy proxy = new LoggerProxy(consoleLogger);

        proxy.logDebug("debug 日志");
        proxy.logInfo("info 日志");
    }
}
