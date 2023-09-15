package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver;


    public MainPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void GetValue(WebElement element , String value)
    {
        element.sendKeys(value);
    }

    public void ClickElement (WebElement element)
    {
        element.click();
    }

    public void scrolldown()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

}
