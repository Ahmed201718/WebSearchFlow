package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class ResultsPage extends MainPage
{
    public ResultsPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='z1asCe MZy1Rb']//*[name()='svg']")
    public WebElement Searchbutton2;


    public int CountOfresults()

    {
        List<WebElement> count =driver.findElements(By.className("LC20lb"));
        return count.size();
    }


    public int ResultsPages ()
    {
        scrolldown();
        return CountOfresults();

    }

    public boolean Related_search()
    {
        List<WebElement> count =driver.findElements(By.className("aXBZVd"));
        return count.isEmpty();
    }



}
