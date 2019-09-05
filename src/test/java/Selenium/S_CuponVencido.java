package Selenium;

import Commons.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_CuponVencido extends Base {
    @Test
    public void AgregarCodigoCuponVencido(){
        driver.findElement(By.id("coupon_code")).click();
        driver.findElement(By.id("coupon_code")).sendKeys("cupon de prueba dos");
    }
    @Test
    public void PresionarBotonAplicarCupVencido () throws InterruptedException {

        driver.findElement(By.name("apply_coupon")).click();
        Thread.sleep(1000);
        String MensajeActual = driver.findElement(By.cssSelector("div.message-container.container.alert-color.medium-text-center")).getText();
        Assert.assertEquals("El cupón ha caducado.", MensajeActual);
        Base.captureScreenShot(driver,"Evidencia Cupón Vencido Exitosamente");

    }
}
