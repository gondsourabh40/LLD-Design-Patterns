package com.designpattern.chainofresponsibility;

public class LogHandlerMain {

    public static void main(String[] args) {
        LogHandler logHandler = new DebugLogHandler(new InfoLogHandler(new ErrorLogHandler(new WarnLogHandler(null))));
        logHandler.log(LogType.WARN, "Warning in system");
        logHandler.log(LogType.ERROR, "Error in system");
        logHandler.log(LogType.WARN, "WARN in system");
    }
}
