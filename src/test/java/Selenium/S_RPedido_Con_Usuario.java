package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class S_RPedido_Con_Usuario extends Base {

    @Test
    public void SeleccionarProductoMenu (){
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }

    @Test
    public void AñadirCarrito () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
    }
    @Test
    public void ClickVerCarritoEmergente() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }@Test
    public void PresionarBotonFinalizar() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a.checkout-button.button.alt.wc-forward")).click();
    }
    @Test
    public void AgregarLasCredenciales() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a.showlogin")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("luis.valor");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Pruebas1234");
    }
    @Test
    public void PresionarAccederBoton() {
        driver.findElement(By.name("login")).click();
    }
    @Test
    public void ElegirRegion() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span/span/span/span/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span/ul/li[13]")).click();
    }
    @Test
    public void PresionarRealizarPedido () throws InterruptedException{
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#place_order")).submit();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(@href, '#')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia Realizó pedido y entró en forma de pago");
        Thread.sleep(2000);
        driver.quit();
    }

}
