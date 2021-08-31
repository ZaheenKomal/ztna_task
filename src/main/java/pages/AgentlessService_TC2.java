package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AgentlessService_TC2 {
    private WebDriver driver;
    public AgentlessService_TC2(WebDriver driver) {
        this.driver=driver;
    }

    private By resourcesTab=By.id("en-ztna-NavCollapseItem-Resources");
    private By serviceOption=By.xpath("//span[text()='Services']");
    private By agentlessServicetoggle=By.xpath("//span[text()='Agentless Services']");
    private By mainAddServiceButton=By.id("en-ztna-AddService-addAgentlessServiceButton");
    private By preAddServiceButton=By.id("en-ztna-prerequisitesButtonContent-AddAgentlessServiceButton");
    private By enterServiceNameButton=By.xpath("//input[@placeholder='Enter Service Name']");
    private By enterServiceUrl=By.id("en-ztna-AddService-serviceURLInput");
    private By testConnectivity=By.xpath("//span[text()='Test Connectivity']");
    private By checkConnection=By.xpath("//span[text()='Connected']");
    private By addServiceConfirmation=By.id("en-ztna-addAgentlessServiceCardButtonContent-AddAgentlessServiceButton");
    private By checkServiceIsAdded=By.xpath("//span[text()='Service URL']");




    public void clickOnResourceTab()
    {
        driver.findElement(resourcesTab).click();
    }

    public void clickOnServiceOption(){
        driver.findElement(serviceOption).click();
    }
    
    public void clickOnAgentlessServiceToggle(){
        driver.findElement(agentlessServicetoggle).click();
    }

    public void clickOnMainAddServiceButton(){
        driver.findElement(mainAddServiceButton).click();
    }

    public void clickOnPreAddServiceButton(){
        driver.findElement(preAddServiceButton).click();
    }

    public void sendServiceName(String serv_name){
        driver.findElement(enterServiceNameButton).sendKeys(serv_name);
    }

    public void sendServiceUrl(String url){
        driver.findElement(enterServiceUrl).sendKeys(url);
    }

    public void clickOnTestConnectivity() throws InterruptedException {
        driver.findElement(testConnectivity).click();
        Thread.onSpinWait();
    }

    public String connectionVerification(){
        return driver.findElement(checkConnection).getText();
    }

    public void clickOnAddServiceConfirmation() throws InterruptedException {
        driver.findElement(addServiceConfirmation).click();
        Thread.sleep(5000);
    }

    public String serviceVerification(){
        return driver.findElement(checkServiceIsAdded).getText();
    }

}
