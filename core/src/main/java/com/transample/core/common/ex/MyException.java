package com.transample.core.common.ex;

/**
 * <p>自定义异常类</p>
 *
 * @author transample
 * @version V.1.0.0
 * @blob https://blog.csdn.net/transample
 * @date created on 上午 11:31 2019-4-27
 */
public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
