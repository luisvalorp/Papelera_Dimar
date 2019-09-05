package Selenium;

import cucumber.api.java.da.Men;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import Commons.Base;

import java.util.concurrent.TimeUnit;

public class S_CuponValido extends Base{

    @Test
    public void IngresarEnProductos(){
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }
    @Test
    public void SeleccionarProducto() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
        Thread.sleep(2000);
    }
    @Test
    public void PresionarVerCarrito(){
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }
    @Test
    public void AgregarCodigoCupon(){
        driver.findElement(By.id("coupon_code")).click();
        driver.findElement(By.id("coupon_code")).sendKeys("cupon de prueba");
    }


    @Test
    public void PresionarBotonAplicarCupon () throws InterruptedException {
        String Mensaje = "El código de cupón se ha aplicado correctamente.";


        driver.findElement(By.name("apply_coupon")).click();
        Thread.sleep(1000);
        String MensajeActual = driver.findElement(By.cssSelector("div.message-container.container.success-color.medium-text-center")).getText();
        Assert.assertEquals(Mensaje, MensajeActual);
        driver.findElement(By.xpath("//tr[2]/th")).isDisplayed();
        driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'[Eliminar]')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia Cupón Valido Exitosamente");
    }
    @Test
    public void Salir() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.quit();
    }

}
