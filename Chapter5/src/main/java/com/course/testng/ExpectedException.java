package com.course.testng;

import org.testng.annotations.Test;

/**
 * 什么时间会用到异常测试？
 * 在期望结果为某一个异常的时候
 */
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println ( "这是一个失败的异常测试" );
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.print ( "这是异常测试" );
        throw new RuntimeException ();

    }

}
