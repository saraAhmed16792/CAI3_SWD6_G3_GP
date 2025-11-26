package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutHome extends BasePage {

    WebElement logoutButton = driver.findElement(By.linkText("Logout"));

    public LogoutHome(WebDriver driver) {
        super(driver);
    }

    public void logoutButtonClick() {
        logoutButton.click();
    }
}
