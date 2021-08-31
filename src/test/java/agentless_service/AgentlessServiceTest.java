package agentless_service;

import data.TestData;
import env_setup.EnvSetupTest;
import org.testng.annotations.Test;
import pages.AgentlessService_TC2;

import static org.testng.Assert.assertEquals;


public class AgentlessServiceTest extends EnvSetupTest {

    @Test (dataProvider = "SignInData", dataProviderClass = TestData.class)
    public void testAgentlessServiceLogin(String email, String pwd) {
        homePageOne.setEmailAddress(email);
        homePageOne.setPassword(pwd);
    }
    @Test (dataProvider = "ServiceData", dataProviderClass = TestData.class)
    public void testAgentlessServiceUseCase(String s_name, String url) throws InterruptedException {
        AgentlessService_TC2 agentlessService_tc2 = homePageOne.loginForAddServiceUSeCase();
        agentlessService_tc2.clickOnResourceTab();
        agentlessService_tc2.clickOnServiceOption();
        agentlessService_tc2.clickOnAgentlessServiceToggle();
        agentlessService_tc2.clickOnMainAddServiceButton();
        agentlessService_tc2.clickOnPreAddServiceButton();
        agentlessService_tc2.sendServiceName(s_name);
        agentlessService_tc2.sendServiceUrl(url);
        agentlessService_tc2.clickOnTestConnectivity();
        agentlessService_tc2.connectionVerification();
        try {
            assertEquals(agentlessService_tc2.connectionVerification(), "Connected");
        } catch (AssertionError error) {
            System.out.println("TestCase2: Test Connection Failed");
            throw error;
        }
        System.out.println("TestCase2: Connection is tested Successfully");
        agentlessService_tc2.clickOnAddServiceConfirmation();
        agentlessService_tc2.serviceVerification();
        try {
            assertEquals(agentlessService_tc2.serviceVerification(), "Service URL");
        } catch (AssertionError error) {
            System.out.println("TestCase2: Service is not added in list");
            throw error;
        }
        System.out.println("TestCase2: New Service is added Successfully");
    }
}
