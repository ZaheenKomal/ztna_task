package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_TC1 {

    private WebDriver driver;
    public HomePage_TC1(WebDriver driver)
    {
        this.driver=driver;
    }

    private By emailAddress=By.id("en-ztna-loginForm-emailInput");
    private By password=By.id("en-ztna-loginForm-passwordInput");
    private By signInButton=By.xpath("//span[text()='Sign in']");
    private By displayedPage =By.id("en-ztna-Users-addUserButton");


    public void setEmailAddress(String email){
        driver.findElement(emailAddress).sendKeys(email);
    }
    public void setPassword(String passcode){
        driver.findElement(password).sendKeys(passcode);
    }
    public void clickOnSignInButton(){
        driver.findElement(signInButton).click();

    }
    public AgentlessService_TC2 loginForAddServiceUSeCase(){
        driver.findElement(signInButton).click();
        return new AgentlessService_TC2(driver);
    }

    public CreateProject_TC3 loginForAddProjectUseCase(){
        driver.findElement(signInButton).click();
        return new CreateProject_TC3(driver);
    }
    public AddPolicy_TC4 loginForAddPolicyUseCase(){
        driver.findElement(signInButton).click();
        return new AddPolicy_TC4(driver);
    }
    public AddRule_TC5 loginForAddRuleUSeCase(){
        driver.findElement(signInButton).click();
        return new AddRule_TC5(driver);
    }

    public String pageVerification()
    {
        return driver.findElement(displayedPage).getText();
    }



}
