package com.designpattern.chainofresponsibility;

public class WarnLogHandler implements LogHandler{
    LogHandler nextLogHandler;
    public WarnLogHandler(LogHandler nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.WARN){
            System.out.println("WARN -" + message);
        }else {
            nextLogHandler.log(logType,message);
        }
    }
}
