package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_FinalizaCompra extends Base {
    @Test
    public void IngresarEnProductos(){
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }
    @Test
    public void AgregarProducto(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
    }
    @Test
    public void ClickEnVerCarrito(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }
    @Test
    public void ClickFinalizarCompra(){
        driver.findElement(By.cssSelector("a.checkout-button.button.alt.wc-forward")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("billing_email")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia Finalizó Compra");
        driver.quit();
    }




}
