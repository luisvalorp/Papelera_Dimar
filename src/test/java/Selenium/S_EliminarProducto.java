package Selenium;

import Commons.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_EliminarProducto extends Base {

    @Test
    public void MenuProductos() {
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }
    @Test
    public void AgregarCarritoP() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
    }
    @Test
    public void BotonVerCarrito() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }
    @Test
    public void EliminarProducto() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='content']/div/div/div/div[2]/div[2]/div/form/div/table/tbody/tr/td/a")).click();
    }
    @Test
    public void VerificarMensaje() {
        String Mensaje = "“Pack de 250 bolsas kraft 32x12x41 cm” eliminado. ¿Deshacer?";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.message-container.container.success-color.medium-text-center")).isDisplayed();
        String MensajeActual = driver.findElement(By.cssSelector("div.message-container.container.success-color.medium-text-center")).getText();
        Assert.assertEquals(Mensaje, MensajeActual);
        driver.findElement(By.xpath("//a[contains(text(),'¿Deshacer?')]")).isDisplayed();
        Base.captureScreenShot(driver, "Evidencia Eliminó Exitosamente");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }
}
