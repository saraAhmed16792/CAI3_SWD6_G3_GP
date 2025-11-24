import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Pages.*;
import org.testng.annotations.Test;


public class TestCase13 {

    WebDriver driver;
    HomePage home;
    CartPage cart;
    Product30DetailPage productdetailpage;

    @BeforeTest
    public void Setup(){
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        home = new HomePage(driver);
    }
    @Test(testName = "Verify that home page is visible successfull" , priority = 0)
    public void hompagevisibility() {
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"Automation Exercise");
    }
    @Test(testName = "Verify product detail is opened" , priority = 1)
    public void ProductDetailpagevisibility(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        home.ViewProduct30Button();
        productdetailpage = new Product30DetailPage(driver);
        Assert.assertEquals(productdetailpage.Productname() , "Premium Polo T-Shirts");
    }
    @Test(testName = "Verify that product is displayed in cart page with exact quantity" , priority = 2)
    public void Productdetailsandquantity(){
        productdetailpage.SetProductQty();
        productdetailpage.AddtoCartBTN();
        productdetailpage.ViewCartBTN();
        cart = new CartPage(driver);
        Assert.assertEquals(cart.getProduct1Quantity() , "4");
    }
    @AfterTest
    public void close(){
        driver.close();
    }
}
