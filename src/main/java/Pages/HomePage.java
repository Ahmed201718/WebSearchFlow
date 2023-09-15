package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends MainPage {



    public HomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "APjFqb")
    private WebElement Searchbox;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
    public WebElement Searchbutton1;



    public void enterKeyword (String Keyword)
    {
        GetValue(Searchbox,Keyword);

    }
    public void Search (WebElement Search)
    {
        ClickElement(Search);
    }

    public void RemoveKeyword()
    {
        Searchbox.clear();
    }


}
