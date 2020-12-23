package me.spoofer.responsibility;

public class LoggerProxy {
    private AbstractLogger loggerChain;

    public LoggerProxy(AbstractLogger loggerChain) {
        this.loggerChain = loggerChain;
    }

    public void logError(String msg) {
        loggerChain.logMessage(AbstractLogger.ERROR, msg);
    }

    public void logInfo(String msg) {
        loggerChain.logMessage(AbstractLogger.INFO, msg);
    }

    public void logDebug(String msg) {
        loggerChain.logMessage(AbstractLogger.DEBUG, msg);
    }

    public void logWarning(String msg) {
        loggerChain.logMessage(AbstractLogger.WARNING, msg);
    }
}
