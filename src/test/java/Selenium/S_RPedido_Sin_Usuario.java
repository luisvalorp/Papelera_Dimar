package Selenium;

import Commons.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;



public class S_RPedido_Sin_Usuario extends Base {

    @Test
    public void MenuPrinProducto() {
        driver.findElement(By.xpath("//a[contains(text(),'Productos')]")).click();
    }
    @Test
    public void AgregarCarritoProd() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Añadir al carrito')]")).click();
    }
    @Test
    public void EmergenteVerCarrito() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Ver carrito')]")).click();
    }
    @Test
    public void FinalizarCompra() {
        driver.findElement(By.cssSelector("a.checkout-button.button.alt.wc-forward")).click();
    }
    @Test
    public void LlenarFormulario() throws Exception {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("billing_email")).click();
        driver.findElement(By.id("billing_email")).sendKeys("valorp.luis@gmail.com");
        driver.findElement(By.id("billing_first_name")).click();
        driver.findElement(By.id("billing_first_name")).sendKeys("Luis");
        driver.findElement(By.id("billing_last_name")).click();
        driver.findElement(By.id("billing_last_name")).sendKeys("Valor");
        driver.findElement(By.id("billing_personal_rut")).click();
        driver.findElement(By.id("billing_personal_rut")).sendKeys("111555444");
        driver.findElement(By.id("billing_type_Boleta")).click();
        driver.findElement(By.id("billing_address_1")).click();
        driver.findElement(By.id("billing_address_1")).sendKeys("Av. Dirección");
        driver.findElement(By.id("billing_ward")).click();
        driver.findElement(By.id("billing_ward")).sendKeys("Nombre comuna");
        driver.findElement(By.id("billing_city")).click();
        driver.findElement(By.id("billing_city")).sendKeys("Nombre ciudad");
        driver.findElement(By.id("billing_pc_chile")).click();
        driver.findElement(By.id("billing_pc_chile")).sendKeys("5000");
        driver.findElement(By.id("billing_phone")).click();
        driver.findElement(By.id("billing_phone")).sendKeys("255555555");
        driver.findElement(By.id("createaccount")).click();
        driver.findElement(By.id("account_password")).click();
        driver.findElement(By.id("account_password")).sendKeys("PruebasQA1234");
    }
    @Test
    public void VerificarPage() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#place_order")).submit();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(@href, '#')]")).isDisplayed();
        Base.captureScreenShot(driver,"Evidencia Creo Usuario y Realizó pedido y entró en forma de pago");
        Thread.sleep(2000);
        driver.quit();
    }

}
