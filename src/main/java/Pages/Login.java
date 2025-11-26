package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends BasePage{

    public Login(WebDriver driver){
        super(driver);
    }

    WebElement loginText = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
    WebElement loginEmail = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    WebElement loginPassword = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
   // WebElement loginErrorText = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));

    public WebElement getLoginText(){
        return loginText;
    }
/*
    public WebElement getLoginErrorText(){
        loginErrorText = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        return loginErrorText;
    }


 */
    public void submitLogin(String email, String password){
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginButton.click();
    }

}
