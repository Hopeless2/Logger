public class Logger {
    protected int num = 1;
    private static Logger logger;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
