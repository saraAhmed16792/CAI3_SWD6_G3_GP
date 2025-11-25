import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.*;

public class case6 {
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
@Test(description = "verify successfull submission of contact form" , priority = 1)
public void GetInTouch(){

    WebElement contact = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"));
    contact.click();
    WebElement getintouch = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[3]/div[1]/div/h2"));
    Assert.assertTrue(getintouch.isDisplayed());

}


@Test(description = "Verify success message is visible" , priority = 2)
    public void contactuspage(){
    contactus Contactus = new contactus(driver);
    Contactus.contactusKeys();
    WebElement successfullmessage = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[3]/div[1]/div/div[2]"));
    Assert.assertTrue(successfullmessage.isDisplayed());
}
    @Test (description = "verify landing to home page sucessfully" , priority = 3)
    public void landingtoHomePage (){
        WebElement homebutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a"));
        homebutton.click();
        Assert.assertEquals(driver.getTitle(),"Automation Exercise");
    }
    @AfterTest
    public void exit(){
        driver.close();
    }
}
