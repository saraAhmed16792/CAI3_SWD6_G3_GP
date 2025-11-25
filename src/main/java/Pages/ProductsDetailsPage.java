package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class ProductsDetailsPage extends BasePage {

    public ProductsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement Product_name = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2"));
    public WebElement Product_Category = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]"));
    public WebElement Product_Price = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span"));
    public WebElement Product_Availability = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b"));
    public WebElement Product_Condition = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b"));
    public WebElement Product_Brand = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]"));


    public boolean isProductNameVisible() {
        try {
            return Product_name.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isProductCategoryVisible() {
        try {
            return Product_Category.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isProductPriceVisible() {
        try {
            return Product_Price.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isProductAvailabilityVisible() {
        try {
            return Product_Availability.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isProductConditionVisible() {
        try {
            return Product_Condition.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isProductBrandVisible() {
        try {
            return Product_Brand.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }







}