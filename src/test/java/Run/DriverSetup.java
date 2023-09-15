package Run;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Utilites.PropertiesHandler;
import Pages.ResultsPage;
import Pages.HomePage;

public class DriverSetup {

    WebDriver driver;
    public JavascriptExecutor jsDriver;
    ResultsPage ResultPageObj;
    HomePage HomePageObj;
    public PropertiesHandler prop =new PropertiesHandler();



    @Parameters({"url", "browserType"})
    public void beforeClass(String url, String browserType) {
        switch (browserType) {
            case ("Chrome"):
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case ("Edge"):
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        jsDriver = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get(url);
    }


    @AfterClass
    public void afterTest() {
        driver.quit();
    }


}
