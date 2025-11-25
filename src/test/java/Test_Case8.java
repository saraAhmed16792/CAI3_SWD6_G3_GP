import Pages.HomePage;
import Pages.ProductPage;
import Pages.ProductsDetailsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case8 {
    WebDriver driver;

    @BeforeTest
    public void Setup(){
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
    }
    @Test(testName = "verify that home page is visible successfully", priority = 0)
    public void visibility(){
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");
        Assert.assertTrue(homePage.Automation_Exersise_Header.isDisplayed());
        homePage.Products_Button_click();
    }

    @Test(testName = "verify that All Products Visible", priority = 1)
    public void To_Products(){
        ProductPage productPage = new ProductPage(driver);
        Assert.assertEquals(driver.getTitle(),"Automation Exercise - All Products");
        Assert.assertTrue(productPage.All_Products_Header.isDisplayed());

    }

    @Test(testName = "verify that All Products image Visible", priority = 2)
    public void Products_visible(){
        ProductPage productPage = new ProductPage(driver);
        int productCount = productPage.getProductsCount();
        Assert.assertTrue(productCount >= 34);
    }

    @Test(testName = "Click On View Product", priority = 3)
    public void View_Product(){
        ProductPage productPage = new ProductPage(driver);
        productPage.View_Product_click();
    }

    @Test(testName = "Verify Product Details", priority = 4)
    public void Product_details(){
        ProductsDetailsPage productdetail = new ProductsDetailsPage(driver);
        Assert.assertTrue(productdetail.isProductNameVisible());
        Assert.assertTrue(productdetail.isProductCategoryVisible());
        Assert.assertTrue(productdetail.isProductAvailabilityVisible());
        Assert.assertTrue(productdetail.isProductPriceVisible());
        Assert.assertTrue(productdetail.isProductConditionVisible());
        Assert.assertTrue(productdetail.isProductBrandVisible());
    }
    @AfterTest
    public void close(){
        driver.close();
    }


}



