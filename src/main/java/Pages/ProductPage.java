package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;


public class ProductPage extends BasePage {

    Actions actions;

    public ProductPage (WebDriver driver){
        super(driver);
        actions = new Actions(driver);
    }

    WebElement Product1 = driver.findElement(By.cssSelector("a[data-product-id=\"1\"]"));
    WebElement Product2 = driver.findElement(By.cssSelector("a[data-product-id=\"2\"]"));
    public WebElement All_Products_Header = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
    public WebElement View_Product_Button = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
    public WebElement Search_Box = driver.findElement(By.id("search_product"));
    public WebElement Search_Button = driver.findElement(By.xpath("//*[@id=\"submit_search\"]/i"));

    public List<WebElement> getAllProductsList() {
        return driver.findElements(By.xpath("//div[@class='product-image-wrapper']"));
    }


    public void Addproduct1(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        actions.moveToElement(Product1).perform();
        Product1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='modal-title w-100' and contains(text(), 'Added!')]")));
    }
    public void ContinueshopButton() {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        WebElement continueshopping = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Continue Shopping')]")));
        continueshopping.click();
    }
    public void Addproduct2(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        actions.moveToElement(Product2).perform();
        Product2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='modal-title w-100' and contains(text(), 'Added!')]")));
    }
    public void ViewCartButton(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        WebElement Viewcart = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("View Cart")));
        Viewcart.click();
    }
    public int Cartquantit(){
        return driver.findElements(By.cssSelector("tbody tr")).size();
    }
    public int getProductsCount() {
        return getAllProductsList().size();
    }
    public void View_Product_click(){
        View_Product_Button.click();
    }
}
