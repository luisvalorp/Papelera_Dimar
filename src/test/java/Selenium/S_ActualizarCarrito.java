package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_ActualizarCarrito extends Base {

    @Test
    public void IngresarMenuPrincipal() {
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }
    @Test
    public void AgregarProducto(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
    }
    @Test
    public void PresionarVerCarritoCompra(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }
    @Test
    public void PresionarSignoMas(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='+']")).click();
    }
    @Test
    public void PresionarActualizarCarrito(){
        driver.findElement(By.name("update_cart")).click();
    }
    @Test
    public void MensajeActualizado(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.message-container.container.success-color.medium-text-center")).getText().contentEquals("Carrito actualizado.");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Base.captureScreenShot(driver,"Actualizó Carrito");
        driver.quit();
    }
}
