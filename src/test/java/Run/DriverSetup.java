package Run;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class DriverSetup {

    WebDriver driver;
    public JavascriptExecutor jsDriver;

    @Parameters({"url", "browserType"})
    public void Driversetup(String url, String browserType) {
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
