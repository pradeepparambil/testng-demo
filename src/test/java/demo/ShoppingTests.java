package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTests {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before ShoppingTests class executed");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After ShoppingTests class executed");
    }
    @Test
    public void productSearch(){
        System.out.println("Searching for a product");
    }
    @Test
    public void addProductToShppingCart(){
        System.out.println("Adding a product to shopping cart");
    }
}
