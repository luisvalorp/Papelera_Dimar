package Commons;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
import java.net.MalformedURLException;

import java.io.File;
import java.net.URL;

public class Base {

    public static WebDriver driver;

    public void AbrirNavegador() throws MalformedURLException{
        
        DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
        capabilities.setCapability("version","");
        capabilities.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        
       /*System.setProperty("webdriver.chrome.driver", "http://localhost:4545/wd/hub");
        driver = new ChromeDriver();
        driver.manage().window().maximize();*/

       /* //Usando Firefox//
        System.setProperty("webdriver.gecko.driver","C:\\Users\\luis.valor\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();*/
        
        /*It's Works for Windows*/
        /*
        DesiredCapabilities dr = null;
        dr = DesiredCapabilities.chrome();
        dr.setBrowserName("chrome");
        dr.setPlatform(Platform.LINUX);*/
        //System.setProperty("webdriver.chrome.driver", "C:\Users\luis.valor\Downloads\chromedriver_win32_new\chromedriver.exe");
        
        /*** Docker toolbox - Jenkins (Windows) ***/
        //driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),dr);
        /*** Docker - Jenkins (Ubuntu) ***/
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        //driver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"),dr);
        
        driver.manage().window().maximize();

    }

    public void AbrirURL(){
        driver.get("https://dimar.wmeza.com/");
    }

    public static void captureScreenShot(WebDriver driver, String screenshotName) {

        try {

            TakesScreenshot ts=(TakesScreenshot)driver;
            File source=ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
            System.out.println(" ScreenShot Taken! ");
        }
        catch (Exception e) {
            System.out.println("Exception  while taking screenshot "+e.getMessage());
        }
    }
}
