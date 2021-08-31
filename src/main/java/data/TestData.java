package data;
import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name = "SignInData")
    public Object[][] getSignInData(){
        Object[][] data1 ={{"zaheen.komal@emumba.com","8L@$tSu**ary"}};
        return data1;
    }

    @DataProvider(name = "ServiceData")
    public Object[][] getServiceData(){
        Object[][] data2 ={{"mentorbox", "mentorbox.com/"}};
        return data2;
    }

    @DataProvider(name = "ProjectCreationData")
    public Object[][] getProjectData(){
        Object[][] data3={{"Project_New", "New Project created from added service"}};
        return data3;
    }

    @DataProvider(name = "AddingPolicyData")
    public Object[][] getPolicyData(){
        Object[][] data4 ={{"Policy_New", "New Policy added with Service Resource"}};
        return data4;
    }



}
