package Selenium;

import Commons.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_CuponNoExiste extends Base{

    @Test
    public void AgregarCodigoCuponNoExistente(){
        driver.findElement(By.id("coupon_code")).click();
        driver.findElement(By.id("coupon_code")).sendKeys("1234");
    }
    @Test
    public void PresionarBotonAplicarCuponNoExistente () throws InterruptedException {
        String Mensaje = "¡El cupón \"1234\" no existe!";

        driver.findElement(By.name("apply_coupon")).click();
        Thread.sleep(1000);
        String MensajeActual = driver.findElement(By.cssSelector("div.message-container.container.alert-color.medium-text-center")).getText();
        Assert.assertEquals(Mensaje, MensajeActual);
        Base.captureScreenShot(driver,"Evidencia Cupón No Existente");
    }

}
