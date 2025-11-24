package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Product30DetailPage extends BasePage {

    public Product30DetailPage(WebDriver driver) {
        super(driver);
    }

    WebElement ProductName = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2"));
    WebElement ProductQty = driver.findElement(By.id("quantity"));
    WebElement AddToCart = driver.findElement(By.className("btn-default"));


    public String Productname (){
        return ProductName.getText();
    }
    public void SetProductQty (){
        ProductQty.clear();
        ProductQty.sendKeys("4");
    }
    public void AddtoCartBTN(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        AddToCart.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='modal-title w-100' and contains(text(), 'Added!')]")));
    }
    public void ViewCartBTN(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Viewcart = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("View Cart")));
        Viewcart.click();
    }

}