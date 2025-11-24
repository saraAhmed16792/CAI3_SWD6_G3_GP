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

    WebElement ProductsClickButton = driver.findElement(By.partialLinkText("Products"));
    WebElement Viewproduct30 = driver.findElement(By.cssSelector("a[href=\"/product_details/30\"]"));

    public void Productsbutton(){
        ProductsClickButton.click();
    }
    public void ViewProduct30Button() {
        Viewproduct30.click();
    }
}
