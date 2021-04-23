package design.pattern.chain;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    // 责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMsg(int level, String msg) {
        if (this.level <= level) {
            write(msg);
        }
        if (nextLogger != null) {
            nextLogger.logMsg(level, msg);
        }
    }

    abstract protected void write(String msg);
}
