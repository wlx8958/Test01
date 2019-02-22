package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * 测试套件的配置
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println ( "BeforeSuite运行" );
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println ( "AfterSuite运行" );
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println ( "BeforeTest运行" );
    }

    @AfterTest
    public void afterTest() {
        System.out.println ( "AfterTest运行" );
    }
}
