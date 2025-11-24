package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }


    private By product1Price = By.cssSelector("tbody tr:nth-child(1) td.cart_price p");
    private By product1Quantity = By.cssSelector("tbody tr:nth-child(1) td.cart_quantity");
    private By product1Total = By.cssSelector("tbody tr:nth-child(1) td.cart_total p");

    private By product2Price = By.cssSelector("tbody tr:nth-child(2) td.cart_price p");
    private By product2Quantity = By.cssSelector("tbody tr:nth-child(2) td.cart_quantity");
    private By product2Total = By.cssSelector("tbody tr:nth-child(2) td.cart_total p");

    public String getProduct1Price(){
        return driver.findElement(product1Price).getText();
    }
    public String getProduct1Quantity(){
        return driver.findElement(product1Quantity).getText();
    }
    public String getProduct1Total(){
        return driver.findElement(product1Total).getText();
    }

    public String getProduct2Price(){
        return driver.findElement(product2Price).getText();
    }
    public String getProduct2Quantity(){
        return driver.findElement(product2Quantity).getText();
    }
    public String getProduct2Total(){
        return driver.findElement(product2Total).getText();
    }
}