import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase5 {
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
    @Test(description = "Verify that home page is visible successfully", priority = 0)
    public void homePage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise");
    }

    @Test(description = " Verify 'New User Signup!' is visible", priority = 1)
    public void txtVisible() throws IOException {
        home.signLoginBtnClick();
        loginPage = new LoginPage(driver);
        loginPage.signUpData();
        String title = driver.getTitle();
        Assert.assertEquals(title,"Email Address already exist!");
    }
    @AfterTest
    public void close(){
        driver.close();
    }
}
