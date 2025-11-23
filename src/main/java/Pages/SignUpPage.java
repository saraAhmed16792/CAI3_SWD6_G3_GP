package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage{
    public SignUpPage(WebDriver driver){
        super(driver);
    }

    WebElement gender = driver.findElement(By.id("id_gender2"));
    WebElement password = driver.findElement(By.id("password"));
    WebElement dayOfBirth = driver.findElement(By.id("days"));
    WebElement monthOfBirth = driver.findElement(By.id("months"));
    WebElement yearOfBirth = driver.findElement(By.id("years"));
    WebElement newsLetter = driver.findElement(By.id("newsletter"));
    WebElement specialOffers = driver.findElement(By.id("optin"));
    WebElement firstName = driver.findElement(By.id("first_name"));
    WebElement lasName = driver.findElement(By.id("last_name"));
    WebElement company = driver.findElement(By.id("company"));
    WebElement address = driver.findElement(By.id("address1"));
    WebElement address2 = driver.findElement(By.id("address2"));
    WebElement country = driver.findElement(By.id("country"));
    WebElement state = driver.findElement(By.id("state"));
    WebElement city = driver.findElement(By.id("city"));
    WebElement zipCode = driver.findElement(By.id("zipcode"));
    WebElement mobileNum = driver.findElement(By.id("mobile_number"));
    WebElement createAccountBtn = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/div/div/div/form/button"));

    public void FillAll(){

        gender.click();
        password.sendKeys("123456789");
        dayOfBirth.sendKeys("09");
        monthOfBirth.sendKeys("February");
        yearOfBirth.sendKeys("1991");
        newsLetter.click();
        specialOffers.click();
        firstName.sendKeys("Ahmed");
        lasName.sendKeys("Mohamed");
        company.sendKeys("company");
        address.sendKeys("Maadi1");
        address2.sendKeys("Maddi2");
        country.sendKeys("Egypt");
        state.sendKeys("Cairo");
        city.sendKeys("Cairo");
        zipCode.sendKeys("123456");
        mobileNum.sendKeys("0120255664");
        createAccountBtn.click();
    }


}
