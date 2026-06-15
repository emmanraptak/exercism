public class LogLine {

    private LogLevel logLevel;
    private String logLevelInfo;
    
    public LogLine(String logLine) {
        String logLevelKey = logLine.substring(1,4);
        logLevelInfo = logLine.substring(7);
        
        switch (logLevelKey) {
            case "TRC":
                logLevel = LogLevel.TRACE;
                break;
            case "DBG":
                logLevel = LogLevel.DEBUG;
                break;
            case "INF":
                logLevel = LogLevel.INFO;
                break;
            case "WRN":
                logLevel = LogLevel.WARNING;
                break;
            case "ERR":
                logLevel = LogLevel.ERROR;
                break;
            case "FTL":
                logLevel = LogLevel.FATAL;
                break;
            default:
                logLevel = LogLevel.UNKNOWN;
                break;
        }
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getOutputForShortLog() {
        return this.logLevel.getLogCode() + ":" + logLevelInfo; 
    }
}
