import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Home;
import pages.Login;
import pages.LogoutHome;

public class TestCase4 {
    WebDriver driver;
    Home home;
    Login login;
    LogoutHome logoutHome;

    @BeforeTest
    public void setUP(){
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        home = new Home(driver);
        driver.manage().window().maximize();
    }

    @Test(description = "Verify that home page is visible successfully", priority = 0)
    public void AuthorizedLogin(){
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");
    }

    @Test(description = "Verify 'Login to your account' is visible", priority = 1)
    public void verifyLoginPage(){
        home.signLoginButtonClick();
        login = new Login(driver);
        Assert.assertTrue(login.getLoginText().isDisplayed());
    }

    @Test(description = "Login with valid credentials and logout",priority = 2)
    public void verifyLoginAndLogout() {
        login = new Login(driver);
        login.submitLogin("mariamyahia333@gmail.com","Lolo_2002");
        logoutHome = new LogoutHome(driver);
        logoutHome.logoutButtonClick();
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Automation Exercise"));
        home.logoutButtonClick();

         */
        Assert.assertEquals(driver.getTitle(),"Automation Exercise - Signup / Login");
    }
}
