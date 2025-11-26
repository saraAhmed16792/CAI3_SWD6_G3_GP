import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase4 {
    WebDriver driver;
    HomePage home;
    LoginPage login;
    LogoutHome logoutHome;

    @BeforeTest
    public void setUP() {
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        home = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @Test(description = "Verify that home page is visible successfully", priority = 0)
    public void AuthorizedLogin() {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
    }

    @Test(description = "Verify 'Login to your account' is visible", priority = 1)
    public void verifyLoginPage() {
        home.signLoginBtnClick();
        login = new LoginPage(driver);
        Assert.assertTrue(login.getLoginText().isDisplayed());
    }

    @Test(description = "Login with valid credentials and logout", priority = 2)
    public void verifyLoginAndLogout() {
        login = new LoginPage(driver);
        login.submitLogin("mariamyahia333@gmail.com", "Lolo_2002");
        logoutHome = new LogoutHome(driver);
        logoutHome.logoutButtonClick();
        Assert.assertEquals(driver.getTitle(), "Automation Exercise - Signup / Login");
    }
}
