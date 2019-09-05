package Commons;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Base {

    public static WebDriver driver;

    public void AbrirNavegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\luis.valor\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

       /* //Usando Firefox//
        System.setProperty("webdriver.gecko.driver","C:\\Users\\luis.valor\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();*/

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
