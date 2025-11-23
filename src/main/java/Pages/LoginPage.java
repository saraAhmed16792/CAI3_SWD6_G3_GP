package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }
    WebElement name = driver.findElement(By.name("name"));
    WebElement SignUpEmail = driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)"));
    WebElement SignUpBtn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
    WebElement newUser = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"));

    public void signUpData() {
        name.sendKeys("Ahmed");
        SignUpEmail.sendKeys("Pudsteck1950@dayrep.com");
        SignUpBtn.click();
    }
    public String getNewUser(){
       return newUser.getText();

    }

}
