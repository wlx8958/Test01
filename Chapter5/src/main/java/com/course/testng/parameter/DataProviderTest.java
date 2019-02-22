package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProviderTest(String name, int age) {
        System.out.println ( "name=" + name + "\tage=" + age );

    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"张三", 10},
                {"李四", 20},
                {"王五", 30},

        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println ( "test1方法 name=" + name + "\tage=" + age );

    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println ( "test1方法 name=" + name + "\tage=" + age );
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName ().equals ( "test1" )) {
            result = new Object[][]{
                    {"张三", 20},
                    {"李四", 25},

            };
        } else if (method.getName ().equals ( "test2" )) {
            result = new Object[][]{
                    {"王五", 28},
                    {"赵刘", 50},
            };
        }
        return result;

    }
}
