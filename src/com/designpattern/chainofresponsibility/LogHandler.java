package com.designpattern.chainofresponsibility;

public interface LogHandler {
    void log(LogType logType, String message);
}
