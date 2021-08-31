package add_rule;

import data.TestData;
import env_setup.EnvSetupTest;
import org.testng.annotations.Test;
import pages.AddRule_TC5;

import static org.testng.Assert.assertEquals;

public class AddRuleTest extends EnvSetupTest {
    @Test(dataProvider = "SignInData", dataProviderClass = TestData.class)
    public void testAddPolicyLogin(String email, String pwd) {
        homePageOne.setEmailAddress(email);
        homePageOne.setPassword(pwd);
    }

    @Test
    public void testAddRuleUseCase()  {
        AddRule_TC5 addRuleTest=homePageOne.loginForAddRuleUSeCase();
        addRuleTest.clickOnPoliciesTab();
        addRuleTest.clickOnOptionIcon();
        addRuleTest.clickOnManageRulesOption();
        addRuleTest.clickOnAddRuleButton();
        addRuleTest.clickOnAccessDropdownOption();
        addRuleTest.clickOnSelectUserOption();
        addRuleTest.clickOnSelectDropdown();
        addRuleTest.clickOnAdminEmail();
        addRuleTest.clickOnTickIcon();
        addRuleTest.clickOnStatus();
        try {
            assertEquals(addRuleTest.clickOnStatus(), "Active");
        } catch (AssertionError error) {
            System.out.println("TestCase5: Failure occur as Status is not ACTIVE");
            throw error;
        }
        System.out.println("TestCase5: Status of added rule is ACTIVE");


    }
}
