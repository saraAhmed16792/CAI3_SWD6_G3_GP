
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.*;
public class case7 {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
    }
    @Test(description = "verify that homepage is visible successfully",priority = 0)
    public void homepage(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Automation Exercise");

    }
    @Test (description = "Verify user is navigated to test cases page successfully" , priority = 1)
public void testcase (){
        testcases TC = new testcases(driver);
        TC.TCbutton();
        WebElement testcasesTitle = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2/b"));
        Assert.assertTrue(testcasesTitle.isDisplayed());

    }
    @AfterTest
    public void exit(){
        driver.close();
    }
}
