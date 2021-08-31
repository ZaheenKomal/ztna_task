package add_policy;

import data.TestData;
import env_setup.EnvSetupTest;
import org.testng.annotations.Test;
import pages.AddPolicy_TC4;

import static org.testng.Assert.assertEquals;

public class AddPolicyTest extends EnvSetupTest {
    @Test(dataProvider = "SignInData", dataProviderClass = TestData.class)
    public void testAddPolicyLogin(String email, String pwd) {
        homePageOne.setEmailAddress(email);
        homePageOne.setPassword(pwd);
    }

    @Test(dataProvider = "AddingPolicyData", dataProviderClass = TestData.class)
    public void testAddPolicyUseCase(String p_name, String des){
        AddPolicy_TC4 addPolicy_tc4=homePageOne.loginForAddPolicyUseCase();
        addPolicy_tc4.clickOnPoliciesTab();
        addPolicy_tc4.clickOnMainAddPolicyButton();
        addPolicy_tc4.sendPolicyName(p_name);
        addPolicy_tc4.sendDescription(des);
        addPolicy_tc4.clickOnSelectServiceResource();
        addPolicy_tc4.clickToSelectResource();
        addPolicy_tc4.clickOnPostAddPolicyButton();
        addPolicy_tc4.clickOnManageRulePageVerification();
        try {
            assertEquals(addPolicy_tc4.clickOnManageRulePageVerification(), "Manage Rules");
        } catch (AssertionError error) {
            System.out.println("TestCase4: Failure occur while redirecting to Manage Rules page");
            throw error;
        }
        System.out.println("TestCase4: New Policy added and Page is Redirected to Manage Rules Successfully");
    }
}
