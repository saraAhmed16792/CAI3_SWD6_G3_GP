package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }
    WebElement signLoginBtn = driver.findElement(By.partialLinkText("Login"));
    public void BtnClick(){
        signLoginBtn.click();
    }
}
