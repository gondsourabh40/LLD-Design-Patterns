package com.designpattern.chainofresponsibility;

public class InfoLogHandler implements LogHandler{
    LogHandler nextLogHandler;
    public InfoLogHandler(LogHandler nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.INFO){
            System.out.println("INFO -" + message);
        }else {
            nextLogHandler.log(logType,message);
        }
    }
}
