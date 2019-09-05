package Selenium;

import Commons.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_EliminarCupon extends Base {
    @Test
    public void MenuProducto() {
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }
    @Test
    public void AgregarCarrito() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
    }
    @Test
    public void VerCarrito() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }
    @Test
    public void AgregarCupon() {
        driver.findElement(By.id("coupon_code")).click();
        driver.findElement(By.id("coupon_code")).sendKeys("cupon de prueba");
        driver.findElement(By.name("apply_coupon")).click();
    }
    @Test
    public void VerificarMensaje() throws InterruptedException {
        String Mensaje = "El cupón ha sido eliminado.";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'[Eliminar]')]")).click();
        Thread.sleep(1000);
        String MensajeActual = driver.findElement(By.cssSelector("div.message-container.container.success-color.medium-text-center")).getText();
        Assert.assertEquals(Mensaje, MensajeActual);
        Thread.sleep(3000);
        Base.captureScreenShot(driver,"Evidencia Eliminó Cupón Exitosamente");
        driver.quit();
    }
}
