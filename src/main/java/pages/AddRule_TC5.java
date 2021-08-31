package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRule_TC5 {
    private WebDriver driver;
    public AddRule_TC5(WebDriver driver){
        this.driver=driver;
    }

    private By policiesTab= By.id("en-ztna-NavItem-Policies-3");
    private By optionIcon= By.id("en-ztna-CardRow-0-actionIcon");
    private By manageRulesOption=By.xpath("//p[text()='Manage Rules']");
    private By addRuleButton=By.xpath("//span[text()='Add a New Rule']");
    private By selectAccessDropdown=By.xpath("//div[text()='Access Group']");
    private By selectUserOption=By.xpath("//div[text()='User']");
    private By selectDropdown=By.xpath("//div[@class='react-select__value-container css-1hwfws3']");
    private By adminEmail=By.xpath("//div[text()='zaheen.komal@emumba.com']");
    private By tickIcon=By.cssSelector("svg[height='13.357']");
    private By status=By.xpath("//span[text()='Active']");

    public void clickOnPoliciesTab(){
        driver.findElement(policiesTab).click();
    }

    public void clickOnOptionIcon(){
        driver.findElement(optionIcon).click();
    }

    public void clickOnManageRulesOption(){
        driver.findElement(manageRulesOption).click();
    }

    public void clickOnAddRuleButton(){
        driver.findElement(addRuleButton).click();
    }
    public void clickOnAccessDropdownOption(){
        driver.findElement(selectAccessDropdown).click();
    }

    public void clickOnSelectUserOption() {
        driver.findElement(selectUserOption).click();
    }

    public void clickOnSelectDropdown(){
        driver.findElement(selectDropdown).click();
    }

    public void clickOnAdminEmail(){
        driver.findElement(adminEmail).click();
    }

    public void clickOnTickIcon(){
        driver.findElement(tickIcon).click();
    }

    public String clickOnStatus(){
        return driver.findElement(status).getText();
    }
}
