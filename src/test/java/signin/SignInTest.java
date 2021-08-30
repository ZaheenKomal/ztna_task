package signin;

import envsetup.EnvSetupTest;
import org.testng.annotations.Test;
import pages.UsersPage_two;

import static org.testng.Assert.assertEquals;

public class SignInTest extends EnvSetupTest {


    @Test
    public void testZTNASignIn()
    {
        homePageOne.setEmailAddress("zaheen.komal@emumba.com");
        homePageOne.setPassword("8L@$tSu**ary");
        UsersPage_two usersPageTwo=homePageOne.clickOnSignInButton();
        assertEquals(usersPageTwo.pageVerification(),"Add Users","User landed on incorrect page");



    }
}
