package Steps;

import Commons.Base;
import Selenium.S_EliminarCupon;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_EliminarCupon extends Base {

    Base comando = new Base();
    S_EliminarCupon EliminarCupon = new S_EliminarCupon();

    @Given("^Iniciar el navegador chrome$")
    public void iniciar_el_navegador_chrome() throws Throwable {
        comando.AbrirNavegador();
    }

    @When("^Entre al sitio web dimar\\.wmaza\\.com$")
    public void entre_al_sitio_web_dimar_wmaza_com() throws Throwable {
        comando.AbrirURL();
    }

    @Then("^Entro en la opción de Productos en el menú principal$")
    public void entro_en_la_opción_de_Productos_en_el_menú_principal() throws Throwable {
        EliminarCupon.MenuProducto();
    }

    @Then("^Realizo click en Agregar Carrito$")
    public void realizo_click_en_Agregar_Carrito() throws Throwable {
        EliminarCupon.AgregarCarrito();
    }

    @Then("^Presiono en la ventana emergente en Ver Carrito$")
    public void presiono_en_la_ventana_emergente_en_Ver_Carrito() throws Throwable {
        EliminarCupon.VerCarrito();
    }

    @Then("^Agrego cupón válido\\(no vencido y existente\\), presino Aplicar Cupón$")
    public void agrego_cupón_válido_no_vencido_y_existente_presino_Aplicar_Cupón() throws Throwable {
        EliminarCupon.AgregarCupon();
    }

    @Then("^Luego elimino el cupon y se verifica el mensaje correspondiente$")
    public void luego_elimino_el_cupon_y_se_verifica_el_mensaje_correspondiente() throws Throwable {
        EliminarCupon.VerificarMensaje();
    }

}
