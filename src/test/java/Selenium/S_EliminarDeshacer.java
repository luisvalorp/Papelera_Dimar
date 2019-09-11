package Selenium;

import Commons.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class S_EliminarDeshacer extends Base {

    @Test
    public void PresionarDeshacer() throws InterruptedException {
        String mensaje = "“Pack de 250 bolsas kraft 32x12x41 cm” eliminado. ¿Deshacer?";

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("div.message-container.container.success-color.medium-text-center")).getText());
        driver.findElement(By.cssSelector("i.icon-checkmark")).isDisplayed();
        String MensajeActual = driver.findElement(By.cssSelector("div.message-container.container.success-color.medium-text-center")).getText();
        Assert.assertEquals(mensaje, MensajeActual);
        driver.findElement(By.xpath("//a[contains(text(),'¿Deshacer?')]")).click();
    }
    @Test
    public void VerificarProducto() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[2]/a/img")).isDisplayed();
        Thread.sleep(1000);
        Base.captureScreenShot(driver, "Evidencia que el deshacer fue exitoso");
        Thread.sleep(2000);
        driver.quit();
    }

}
