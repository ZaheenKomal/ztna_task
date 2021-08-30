package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_One {

    private WebDriver driver;
    public HomePage_One(WebDriver driver)
    {
        this.driver=driver;
    }

    private By emailAddress=By.id("en-ztna-loginForm-emailInput");
    private By password=By.id("en-ztna-loginForm-passwordInput");
    private By signInButton=By.xpath("//span[text()='Sign in']");

    public void setEmailAddress(String email){
        driver.findElement(emailAddress).sendKeys(email);
    }
    public void setPassword(String passcode){
        driver.findElement(password).sendKeys(passcode);
    }
    public UsersPage_two clickOnSignInButton(){
        driver.findElement(signInButton).click();
        return new UsersPage_two(driver);
    }



}
