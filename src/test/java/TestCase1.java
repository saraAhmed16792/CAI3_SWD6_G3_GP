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

public class TestCase1 {
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
        loginPage.getNewUser();
        Assert.assertEquals(loginPage.getNewUser(), "New User Signup!");
        loginPage.signUpData();
    }

    @Test(description = "verify complete register", priority = 2)
    public void completeRegister() {
        home.signLoginBtnClick();
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
        signUpPage.FillAll();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise - Account Created");
    }

    @Test(description = " Verify that 'Logged in as username' is visible", priority = 3)
    public void checkUser() {
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
        signUpPage =new SignUpPage(driver);
        signUpPage.continueBtn();
        String userName = driver.getTitle();
        Assert.assertEquals(userName, " Logged in as Ahmed");

    }
    @AfterTest
    public void close(){
        driver.close();
    }

}

