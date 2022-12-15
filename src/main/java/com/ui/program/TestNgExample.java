package com.ui.program;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNgExample {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Suite level precondition..");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("Before group method...");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("After group method..");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Test level precondition..");
    }
    @BeforeClass
    public void init() {
        System.out.println("Class level precondition..");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("Method level precondition..");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Method level post condition..");
    }

    @AfterClass
    public void postCondition() {
        System.out.println("Class level post condition..");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Test level post condition..");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Suite level post condition..");
    }

    @Test(priority = 1, groups = {"smoke","regression"})
    public void demoTest() {
        System.out.println("Test is started..");
    }
}
