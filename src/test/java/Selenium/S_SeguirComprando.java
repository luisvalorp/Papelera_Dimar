package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class S_SeguirComprando extends Base {

    @Test
    public void PresionarSeguirComprando() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//td/div/a")).click();
    }
    @Test
    public void ProductoDiferente() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(@href, '/productos/?add-to-cart=126')]")).click();
        Thread.sleep(2000);
    }
    @Test
    public void VerificarElementos() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//img[@alt='bolsakraft'])[3]")).isDisplayed();
        driver.findElement(By.xpath("(//img[@alt='bolsakraft'])[4]")).isDisplayed();
        Base.captureScreenShot(driver, "Evidencia de Seguir Comprando Exitosa");
        Thread.sleep(1000);
        driver.quit();
    }
}
