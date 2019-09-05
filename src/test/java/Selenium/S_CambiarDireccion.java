package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;



public class S_CambiarDireccion extends Base {

    @Test
    public void MenuPrincial(){
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }
    @Test
    public void AgregarProducto(){
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
    }
    @Test
    public void PresionarVerCarrito(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }
    @Test
    public void CambiarDireccion() {
        driver.findElement(By.xpath("//a[contains(text(),'Cambiar dirección')]")).click();
    }
    @Test
    public void ElegirDireccion() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("select2-calc_shipping_state-container")).click();
        driver.findElement(By.xpath("//span/ul/li[1]")).click();
    }
    @Test
    public void BotonActualizar() {
        driver.findElement(By.name("calc_shipping")).click();
    }
    @Test
    public void VerificarPantalla() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.message-container.container.medium-text-center")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia Cambió la Dirección");
        Thread.sleep(1000);
        driver.quit();
    }
}
