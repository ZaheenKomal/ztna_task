package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPolicy_TC4 {
    private WebDriver driver;
    public AddPolicy_TC4(WebDriver driver){
        this.driver=driver;
    }


    private By policiesTab= By.id("en-ztna-NavItem-Policies-3");
    private By mainAddPolicyButton=By.name("addPolicy");
    private By enterPolicyName=By.xpath("//input[@name='name']");
    private By enterDescription=By.xpath("//textarea[@name='description']");
    private By selectServiceResource=By.xpath("//div[text()='Select Resource']");
    private By selectedResource=By.xpath("//p[text()='mentorbox']");
    private By postAddPolicyButton=By.id("en-ztna-modal-saveButton");
    private By manageRulePageVerification=By.xpath("//span[text()='Manage Rules']");

    public void clickOnPoliciesTab(){
        driver.findElement(policiesTab).click();
    }

    public void clickOnMainAddPolicyButton(){
        driver.findElement(mainAddPolicyButton).click();
    }

    public void sendPolicyName(String p_name){
        driver.findElement(enterPolicyName).sendKeys(p_name);
    }

    public void sendDescription(String des){
        driver.findElement(enterDescription).sendKeys(des);
    }

    public void clickOnSelectServiceResource(){
        driver.findElement(selectServiceResource).click();
    }

    public void clickToSelectResource(){
        driver.findElement(selectedResource).click();
    }

    public void clickOnPostAddPolicyButton(){
        driver.findElement(postAddPolicyButton).click();
    }

    public String  clickOnManageRulePageVerification(){
        return driver.findElement(manageRulePageVerification).getText();
    }


}
