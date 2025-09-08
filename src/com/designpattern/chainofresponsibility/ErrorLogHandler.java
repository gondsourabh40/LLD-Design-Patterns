package com.designpattern.chainofresponsibility;

public class ErrorLogHandler implements LogHandler{
    private LogHandler nextLogHandler;

    public ErrorLogHandler(LogHandler nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.ERROR){
            System.out.println("ERROR -" + message);
        }else{
            nextLogHandler.log(logType, message);
        }
    }
}
