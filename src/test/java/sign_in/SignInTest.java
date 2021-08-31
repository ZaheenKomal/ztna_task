package sign_in;

import data.TestData;
import env_setup.EnvSetupTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SignInTest extends EnvSetupTest {


    @Test (dataProvider = "SignInData", dataProviderClass = TestData.class)
    public void testSignInUseCase(String email, String pwd)
    {
        homePageOne.setEmailAddress(email);
        homePageOne.setPassword(pwd);
        homePageOne.clickOnSignInButton();
        try {
            assertEquals(homePageOne.pageVerification(), "Add Users");
        } catch (AssertionError error) {
            System.out.println("TestCase1: User landed on incorrect page");
            throw error;
        }
        System.out.println("TestCase1: User landed on correct page successfully");
    }

}
