package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactus extends BasePage {
    public contactus (WebDriver driver){
        super(driver);
    }
        WebElement name = driver.findElement(By.name("name"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement subject = driver.findElement(By.name("subject"));
        WebElement message = driver.findElement(By.name("message"));
        WebElement submit = driver.findElement(By.name("submit"));

    public void contactusKeys (){
        name.sendKeys("Mai");
        email.sendKeys("Mai.Shahin.274@gmail.com");
        subject.sendKeys("Testing");
        message.sendKeys("Testing");
        submit.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
