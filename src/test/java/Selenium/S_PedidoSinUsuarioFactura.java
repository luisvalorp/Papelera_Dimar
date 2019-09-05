package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class S_PedidoSinUsuarioFactura extends Base {

    @Test
    public void LlenarFormularioFactura() throws Exception {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("billing_email")).click();
        driver.findElement(By.id("billing_email")).sendKeys("metaldiz@gmail.com");

        driver.findElement(By.id("billing_first_name")).sendKeys("Luis");
        driver.findElement(By.id("billing_last_name")).sendKeys("Valor");

        driver.findElement(By.id("billing_type_factura")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("billing_company")).click();
        driver.findElement(By.id("billing_company")).sendKeys("Razon");

        driver.findElement(By.id("billing_company_rut")).click();
        driver.findElement(By.id("billing_company_rut")).sendKeys("Rut");

        driver.findElement(By.id("billing_company_giro")).click();
        driver.findElement(By.id("billing_company_giro")).sendKeys("Giro");

        driver.findElement(By.id("billing_personal_rut")).click();
        driver.findElement(By.id("billing_personal_rut")).sendKeys("Rut persona");

        driver.findElement(By.id("billing_address_1")).click();
        driver.findElement(By.id("billing_address_1")).sendKeys("Direccion");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span/span/span/span/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span/ul/li[13]")).click();

        driver.findElement(By.id("billing_ward")).click();
        driver.findElement(By.id("billing_ward")).sendKeys("comuna");

        driver.findElement(By.id("billing_city")).click();
        driver.findElement(By.id("billing_city")).sendKeys("ciudad");

        driver.findElement(By.id("billing_pc_chile")).click();
        driver.findElement(By.id("billing_pc_chile")).sendKeys("codigo1234");

        driver.findElement(By.id("billing_phone")).click();
        driver.findElement(By.id("billing_phone")).sendKeys("132846888");

        driver.findElement(By.id("createaccount")).click();

        driver.findElement(By.id("account_password")).click();
        driver.findElement(By.id("account_password")).sendKeys("Pruebas1234");

        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#place_order")).submit();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(@href, '#')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia Creo Usuario y Realizó pedido con factura y entró en forma de pago");
        Thread.sleep(2000);
        driver.quit();
    }
}
