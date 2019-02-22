package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 5, threadPoolSize = 5)
    public void test() {
        System.out.println ( 1 );
        System.out.printf ( "Thread id：%s%n", Thread.currentThread ().getId () );
    }
}
