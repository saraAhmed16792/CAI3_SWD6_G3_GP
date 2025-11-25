import Pages.HomePage;
import Pages.ProductPage;
import Pages.ProductsDetailsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case10 {
    WebDriver driver;

    @BeforeTest
    public void Setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    @Test(testName = "verify that home page is visible successfully", priority = 0)
    public void visibility() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
        Assert.assertTrue(homePage.Automation_Exersise_Header.isDisplayed());
    }
    @Test(testName = "verify Subscription Header", priority = 1)
    public void verify_Subscription() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(driver.getTitle(), "Subscription");
        Assert.assertTrue(homePage.Subscription_Header.isDisplayed());
    }
    @Test(testName = "verify Subscription Message", priority = 1)
    public void verify_Subscriptin() {
        HomePage homePage = new HomePage(driver);
        homePage.Subscription_email.sendKeys("testdepi488@gmail.com");
        homePage.Subscription_Button_click();
        Assert.assertTrue(homePage.isSuccessMessageVisible(), "Success message not visible!");
    }

    @AfterTest
    public void close(){
        driver.close();
    }



}