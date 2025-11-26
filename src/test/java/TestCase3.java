import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase3 {

    WebDriver driver;
    HomePage home;
    LoginPage login;

    @BeforeTest
    public void setUP() {
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        home = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @Test(description = "Verify that home page is visible successfully", priority = 0)
    public void unAuthorizedLogin() {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
    }

    @Test(description = "Verify 'Login to your account' is visible", priority = 1)
    public void verifyLoginPage() {
        home.signLoginBtnClick();
        login = new LoginPage(driver);
        Assert.assertTrue(login.getLoginText().isDisplayed());
    }


    @Test(description = "Verify error 'Your email or password is incorrect!' is visible", priority = 2)
    public void verifyLoginError() {
        login = new LoginPage(driver);
        login.submitLogin("Mariam4t6@gmail.com", "Mariam444");
        String loginErrorMessage = "Your email or password is incorrect!";
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p")).getText(), loginErrorMessage);
    }


}
