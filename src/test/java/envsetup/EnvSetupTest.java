package envsetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage_One;

import java.util.concurrent.TimeUnit;

public class EnvSetupTest {

    private WebDriver driver;
    protected HomePage_One homePageOne;

    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qa-controller.emumbadevops.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        homePageOne = new HomePage_One(driver);

    }

    /*@AfterClass
    public void tearDown(){
        driver.quit();
    }*/


}/*  private ChromeOptions getChromeOptions()
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;

    }*/
