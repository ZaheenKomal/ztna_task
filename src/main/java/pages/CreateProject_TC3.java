package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateProject_TC3 {
    private WebDriver driver;
    public CreateProject_TC3 (WebDriver driver){
        this.driver=driver;
    }

    private By resourcesTab=By.id("en-ztna-NavCollapseItem-Resources");
    private By projectOption= By.id("en-ztna-NavItem-Projects-2-5");
    private By mainCreateProjectButton=By.id("en-ztna-Projects-createProjectButton");
    private By enterProjectName=By.id("en-ztna-AddProject-projectNameInput");
    private By enterDescription=By.id("en-ztna-AddProject-projectDescriptionInput");
    private By selectServiceOptions=By.xpath("//div[text()='Select services']");
    private By selectedService=By.xpath("//p[text()='mentorbox']");
    private By postCreateProjectButton=By.id("en-ztna-modal-saveButton");
    private By projectVerification=By.xpath("//span[text()='No of Services']");

    public void clickOnResourceTab(){
        driver.findElement(resourcesTab).click();
    }

    public void clickOnProjectOption(){

        driver.findElement(projectOption).click();
    }

    public void clickOnMainCreateProjectButton(){
        driver.findElement(mainCreateProjectButton).click();
    }
    public void sendProjectName(String p_name){
        driver.findElement(enterProjectName).sendKeys(p_name);
    }
    public void sendDescription(String des){
        driver.findElement(enterDescription).sendKeys(des);
    }
    public void clickOnSelectServiceOptions(){
        driver.findElement(selectServiceOptions).click();
    }
    public void clickToSelectService(){
        driver.findElement(selectedService).click();
    }
    public void clickOnPostCreateProjectButton(){
        driver.findElement(postCreateProjectButton).click();
    }
    public String  clickOnProjectVerification(){
        return driver.findElement(projectVerification).getText();
    }
}
