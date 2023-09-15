package Utilites;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHandler {

    private Properties properties = new Properties();

    public  PropertiesHandler()
    {
        try {
            InputStream input = new FileInputStream("src/test/resources/GeneraFile.properties");
            properties.load(input);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String geturl()

    {
        return properties.getProperty("url");
    }

    public String getfirstkeyword()
    {
        return properties.getProperty("firstsearchkeyword");

    }
    public String getsecondkeyword()

    {
        return properties.getProperty("secondsearchkeyword");

    }
    public String getbrowser1()

    {
        return properties.getProperty("browser1");

    }
    public String getbrowser2()

    {
        return properties.getProperty("broswer");

    }
    public int getresultnumber()
    {
        return Integer.parseInt(properties.getProperty("actualnumberofresult"));

    }





}
