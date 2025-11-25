import Pages.HomePage;
import Pages.ProductsDetailsPage;
import Pages.ProductPage;
import Pages.Searched_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case9 {
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
    @Test(testName = "Enter Product Name and click search", priority = 2)
    public void Search_Product(){
        ProductPage productPage = new ProductPage(driver);
        productPage.Search_Box.sendKeys("Top");
        productPage.Search_Button.click();
    }

    @Test(testName = "Verify Related Searched Product visible", priority = 3)
    public void Product_details(){
        Searched_Page searchedPage = new Searched_Page(driver);
        Assert.assertTrue(searchedPage.isProductNameVisible());

    }

    @Test(testName = "Verify Related Searched Product visible", priority = 4)
    public void Product_Related_details(){
        Searched_Page searchedPage = new Searched_Page(driver);
        int productCount = searchedPage.getSearchedProductsCount();
        Assert.assertTrue(productCount >= 14);
    }
    @AfterTest
    public void close(){
        driver.close();
    }

}



