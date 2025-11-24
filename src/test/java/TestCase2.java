import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCase2 {
    WebDriver driver;
    HomePage home;
    SignUpPage signUpPage;
    LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
        home = new HomePage(driver);
    }
    @Test(description = "Verify that home page is visible successfully" , priority = 0)
    public void homePage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise");
    }
    @Test(description = "Verify 'Login to your account' is visible", priority = 1)
    public void loginPage(){
        home.BtnClick();
        loginPage = new LoginPage(driver);
        loginPage.getLoginToAccount();
        Assert.assertEquals(loginPage.getLoginToAccount(),"Login to your account");
        loginPage.loginData();


    }

}
