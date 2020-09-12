package demo;

import org.junit.After;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class LoginTests {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I execute before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I execute After Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I execute Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I execute After Test");
    }



    @BeforeMethod
    public void beforeEachMethod(){
        System.out.println("I execute before each method");
    }
    @AfterMethod
    public void afterEachMethod(){
        System.out.println("I execute after each method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before LoginTests class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After LoginTests class");
    }

    @Test(testName = "Login test with valid username and password",
            description = "Enter valid username and invalid password" +
                    " and click signin button",priority = 1)
    public void loginTest(){
        System.out.println("Login test with valid user");
    }
    @Test(testName = "Login test with invalid username and password",priority = 2)
    public void loginTestInvalidUser(){
        System.out.println("Login test with invalid user");
    }

    @Test(testName = "Verify home page title",priority = 3)
    public void homePageTest(){
        System.out.println("Homepage validation");
        Assert.assertEquals("Myban","MyBank", "Page title is incorrect");
    }

    @Test(testName = "Verify logout",priority = 4)
    public void logout(){
        System.out.println("logout successful");
        throw new SkipException("Skipping the test");
    }
}
