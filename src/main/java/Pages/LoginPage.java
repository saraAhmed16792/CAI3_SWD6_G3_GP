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
    WebElement loginToAccount = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
    WebElement loginText = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
    WebElement loginEmail = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    WebElement loginPassword = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));

    public WebElement getLoginText() {
        return loginText;
    }

    public void submitLogin(String email, String password) {
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        loginButton.click();
    }

    public void signUpData() {
        name.sendKeys("Ahmed");
        SignUpEmail.sendKeys("Pudsteck0000@dayrep.com");
        SignUpBtn.click();
    }

    public String getNewUser(){
       return newUser.getText();

    }

    public String getLoginToAccount(){
        return loginToAccount.getText();
    }

    public void loginData(){
        loginEmail.sendKeys("Pudsteck0000@dayrep.com");
        loginPassword.sendKeys("123456789");
        loginButton.click();
    }



}
