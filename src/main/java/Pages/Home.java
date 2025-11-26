package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home extends BasePage{

    public Home(WebDriver driver){
        super(driver);
    }

    WebElement signLoginButton = driver.findElement(By.linkText("Signup / Login"));
   // WebElement logoutButton = driver.findElement(By.linkText("Logout"));

    public void signLoginButtonClick(){
        signLoginButton.click();
    }
/*
    public void logoutButtonClick(){
        wait.until(ExpectedConditions.elementToBeClickable((By) logoutButton)).click();
    }


 */
}
