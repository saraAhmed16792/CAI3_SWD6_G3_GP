package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Searched_Page extends BasePage {

    public Searched_Page(WebDriver driver){
        super(driver);
    }

    WebElement Product_name = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p"));
    public List<WebElement> getAllSearchedProductsList() {
        return driver.findElements(By.xpath("//div[@class='product-image-wrapper']"));
    }

    public int getSearchedProductsCount() {
        return getAllSearchedProductsList().size();
    }
    public boolean isProductNameVisible() {
        try {
            return Product_name.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
