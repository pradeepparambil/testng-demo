package demo;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "userInfo")
    public Object[][] loginInfo(){
        return new Object[][]{
                {"john","john123"},
                {"mary","mary123"}
        };
    }
}
