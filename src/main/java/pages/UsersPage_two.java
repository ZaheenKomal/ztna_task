package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage_two {
    private WebDriver driver;
    public UsersPage_two(WebDriver driver)
    {
        this.driver=driver;
    }


    private By displayedPage =By.id("en-ztna-Users-addUserButton");

    public String pageVerification()
    {
        return driver.findElement(displayedPage).getText();
    }
}
