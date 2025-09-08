package com.designpattern.chainofresponsibility;

public class DebugLogHandler implements LogHandler{
    LogHandler nextLogHandler;
    public DebugLogHandler(LogHandler nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.DEBUG){
            System.out.println("DEBUG -" + message);
        }else {
            nextLogHandler.log(logType,message);
        }
    }
}
