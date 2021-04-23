package design.pattern.chain;

public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger logChain = getChainOfLoggers();

        logChain.logMsg(AbstractLogger.INFO, "This is an information.");
        System.out.println();

        logChain.logMsg(AbstractLogger.DEBUG, "This is a debug level information.");
        System.out.println();

        logChain.logMsg(AbstractLogger.ERROR, "This is an error information.");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
