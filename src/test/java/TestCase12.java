import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Pages.*;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class TestCase12 {

    WebDriver driver;
    HomePage home;
    ProductPage products;
    CartPage cart;


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

    @Test(testName = "Verify both products are added to Cart" , priority = 1)
    public void AddToCart(){
        home.Productsbutton();
        products = new ProductPage(driver);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        products.Addproduct1();
        products.ContinueshopButton();
        products.Addproduct2();
        products.ViewCartButton();
        int cartItems = products.Cartquantit();
        Assert.assertEquals(cartItems , 2);
    }
    @Test(testName = "Verify their prices, quantity and total price" , priority = 2)
    public  void CheckDetails(){
        cart = new CartPage(driver);
        Assert.assertEquals(cart.getProduct1Quantity() , "1");
        Assert.assertEquals(cart.getProduct1Price() , "Rs. 500");
        Assert.assertEquals(cart.getProduct1Total() , "Rs. 500");
        Assert.assertEquals(cart.getProduct2Quantity(), "1");
        Assert.assertEquals(cart.getProduct2Price(), "Rs. 400");
        Assert.assertEquals(cart.getProduct2Total(), "Rs. 400");

    }
    @AfterTest
    public void close(){
        driver.close();
    }

}
