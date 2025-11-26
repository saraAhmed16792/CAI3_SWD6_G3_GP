package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutHome extends BasePage {
    public LogoutHome(WebDriver driver){
        super(driver);
    }

    WebElement logoutButton = driver.findElement(By.linkText("Logout"));

    public void logoutButtonClick(){
        logoutButton.click();
    }
}
