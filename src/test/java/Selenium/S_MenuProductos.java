package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_MenuProductos extends Base {

    @Test
    public void MenuTodos() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Caja de pizza')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja estándar aletas cortas')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja estándar aletas largas')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja para botellas separadores clásicos')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja para botellas separadores especiales')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja postal')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja sin aletas')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja Wrap')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Pack de 250 bolsas kraft 32x12x41 cm')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Pack de 250 bolsas kraft 32x17x43 cm')]")).isDisplayed();
        Base.captureScreenShot(driver, "Evidencia que se visualizan todos los productos");
        driver.quit();
    }
    @Test
    public void MenuBolsas() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Bolsas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Pack de 250 bolsas kraft 32x12x41 cm')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Pack de 250 bolsas kraft 32x17x43 cm')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las bolas");
        driver.quit();
    }
    @Test
    public void MenuCajasPizzas() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas de pizza')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja de pizza')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las cajas de pizzas");
        driver.quit();
    }
    @Test
    public void MenuCajasEstandar() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas Estándar')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja estándar aletas cortas')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja estándar aletas largas')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las cajas estandar");
        driver.quit();
    }
    @Test
    public void MenuCajaAletasCortas() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas Estándar')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Aletas cortas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja estándar aletas cortas')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las Cajas aletas cortas");
        driver.quit();
    }
    @Test
    public void MenuAletasLargas() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas Estándar')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Aletas largas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja estándar aletas largas')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las cajas aletas largas");
        driver.quit();
    }
    @Test
    public void MenuCajaBotellas() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas para Botellas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja para botellas separadores clásicos')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Caja para botellas separadores especiales')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las Cajas de botellas");
        driver.quit();
    }
    @Test
    public void MenuBotellaClasico() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas para Botellas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Separadores clásicos')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja para botellas separadores clásicos')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las cajas botellas clásicas");
        driver.quit();
    }
    @Test
    public void MenuBotellaEspeciales() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas para Botellas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Separadores especiales')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja para botellas separadores especiales')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las Cajas de botellas especiales");
        driver.quit();
    }
    @Test
    public void MenuCajaPostales() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas postales')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja postal')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las cajas postales");
        driver.quit();
    }
    @Test
    public void MenuCajaSinAletas() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas sin aletas')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja sin aletas')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las cajas sin aletas");
        driver.quit();
    }
    @Test
    public void MenuCajaWrap() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Cajas wrap')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Caja Wrap')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia que se visualizan las cajas wrap");
        driver.quit();
    }
}
