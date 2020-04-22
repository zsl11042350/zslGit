package com.neusoft.exception;

/**
 * @Author: wwb
 * @Date: 2020/4/20 14:53
 */
public class MyException extends Exception {

    private String message;

    public MyException(String message) {
        super(message);
    }
}
