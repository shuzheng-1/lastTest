package com.qf.test.exception;

public class MyException extends Exception {

    public MyException(String s){
        super("订单添加失败");
    }
}
