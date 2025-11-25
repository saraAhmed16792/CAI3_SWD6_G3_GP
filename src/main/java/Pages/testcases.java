package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testcases extends BasePage {
    public testcases(WebDriver driver){
        super(driver);
    }
    WebElement testcaseButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
    public void TCbutton (){
        testcaseButton.click();
    }
}
