package demo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

//@Listeners({TestNGListener.class})
public class LoginTests {
    @BeforeSuite()
    public void beforeSuite(){
        System.out.println("Before Suite executed");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite executed");
    }
    @Parameters({"browser","os"})
    @BeforeTest()
    public void beforeTest(String browser,String os){
        System.out.println("Before Test executed");
        System.out.println("Browser : " + browser);
        System.out.println("OS : " + os);
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test executed");
    }


    @BeforeMethod
    public void beforeEachMethod(){
        System.out.println("Before method executed");
    }
    @AfterMethod
    public void afterEachMethod(){
        System.out.println("After method executed");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before LoginTests class executed");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After LoginTests class executed");
    }

    @Test(testName = "Login test with valid username and password",
            description = "Enter valid username and invalid password" +
                    " and click sign-in button",priority = 1
            ,dataProvider = "userInfo", dataProviderClass = demo.TestData.class)
    public void loginTest(String username, String password){
        System.out.println("Login test with username : "+ username+ ", password : "+ password);
    }
    @Test(testName = "Login test with invalid username and password",priority = 2)
    public void loginTestInvalidUser(){
        System.out.println("Login test with invalid user");
    }

    @Test(testName = "Verify home page title",priority = 3)
    public void homePageTest(){
        System.out.println("Homepage validation");
        Assert.assertEquals("MyBank","MyBank", "Page title is incorrect");
        Assert.assertTrue(10==10,"Nos not equal");
        Assert.fail("Test failed");

    }

    @Test(testName = "Verify logout",priority = 4)
    public void logout(){
        System.out.println("logout successful");
        throw new SkipException("Skipping the test");
    }
}
