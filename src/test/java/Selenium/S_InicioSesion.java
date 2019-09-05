package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;


public class S_InicioSesion extends Base {


    @Test
    public void ClickEnAcceder(){
        driver.findElement(By.xpath("//div[@id='top-bar']/div/div[3]/ul/li[2]/a/span")).click();
    }
    @Test
    public void AgregoCredenciales(){
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("luis.valor");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Pruebas1234");
    }
    @Test
    public void BotonAcceder(){
        driver.findElement(By.name("login")).click();
    }
    @Test
    public void InicioyCierra() throws InterruptedException {
        driver.findElement(By.className("icon-user")).isDisplayed();
        Base.captureScreenShot(driver,"Inició Sesión");
        Thread.sleep(2000);
        driver.quit();
    }
}
