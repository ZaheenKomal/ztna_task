package create_project;

import data.TestData;
import env_setup.EnvSetupTest;
import org.testng.annotations.Test;
import pages.CreateProject_TC3;

import static org.testng.Assert.assertEquals;

public class CreateProjectTest extends EnvSetupTest {

    @Test(dataProvider = "SignInData", dataProviderClass = TestData.class)
    public void testProjectCreationLogin(String email, String pwd) {
        homePageOne.setEmailAddress(email);
        homePageOne.setPassword(pwd);
    }

    @Test (dataProvider = "ProjectCreationData", dataProviderClass = TestData.class)
    public void testProjectCreationUseCase(String p_name, String desc){
        CreateProject_TC3 createProjectTest=homePageOne.loginForAddProjectUseCase();
        createProjectTest.clickOnResourceTab();
        createProjectTest.clickOnProjectOption();
        createProjectTest.clickOnMainCreateProjectButton();
        createProjectTest.sendProjectName(p_name);
        createProjectTest.sendDescription(desc);
        createProjectTest.clickOnSelectServiceOptions();
        createProjectTest.clickToSelectService();
        createProjectTest.clickOnPostCreateProjectButton();
        createProjectTest.clickOnProjectVerification();
        try {
            assertEquals(createProjectTest.clickOnProjectVerification(), "No of Services");
        } catch (AssertionError error) {
            System.out.println("TestCase3: Project is Not added");
            throw error;
        }
        System.out.println("TestCase3: New Project gets created Successfully");

    }

}
