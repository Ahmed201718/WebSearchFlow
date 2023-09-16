package Run;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Utilites.PropertiesHandler;
import Pages.ResultsPage;
import Pages.HomePage;


public class TestCases extends DriverSetup {

    ResultsPage ResultPageObj;
    HomePage HomePageObj;
    public PropertiesHandler prop = new PropertiesHandler();
     int NmOfResult1;
     int TotalNmOfResults;
     int NmOfResult2;



    @BeforeClass
    public void test() {
        Driversetup(prop.geturl(), prop.getbrowser1());
        HomePageObj = new HomePage(driver);
        ResultPageObj = new ResultsPage(driver);
    }

    @Test
    public void test1() {
        HomePageObj.enterKeyword(prop.getfirstkeyword());
        HomePageObj.Search(HomePageObj.Searchbutton1);
    }

    @Test
    public void test2() {
        HomePageObj.RemoveKeyword();
        HomePageObj.enterKeyword(prop.getsecondkeyword());
        HomePageObj.Search(ResultPageObj.Searchbutton2);
    }

    @Test
    public void test3() {
        Assert.assertEquals(ResultPageObj.CountOfresults(), prop.getresultnumber());
        NmOfResult1=ResultPageObj.CountOfresults();
    }

    @Test
    public void test4() throws InterruptedException {

        ResultPageObj.scrolldown();
        Thread.sleep(3000);
    }

    @Test
    public void test5() {
        TotalNmOfResults=ResultPageObj.CountOfresults();
        NmOfResult2=TotalNmOfResults-NmOfResult1;
        Assert.assertNotEquals(NmOfResult1,NmOfResult2);
    }

    @Test
    public void test6(){
        Assert.assertFalse(ResultPageObj.Related_search());
    }







}
