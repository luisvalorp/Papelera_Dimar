package Steps;

import Commons.Base;
import Selenium.S_CambiarDireccion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_CambiarDireccion extends Base {

    Base comando = new Base();
    S_CambiarDireccion CambiarDireccion = new S_CambiarDireccion();


    @Given("^Abro el Chrome como navegador$")
    public void abro_el_Chrome_como_navegador() throws Throwable {
        comando.AbrirNavegador();
    }

    @When("^Entro a dimar\\.meza\\.com$")
    public void entro_a_dimar_meza_com() throws Throwable {
        comando.AbrirURL();
    }

    @Then("^Realizo click en el menú principal en la opción Productos$")
    public void realizo_click_en_el_menú_principal_en_la_opción_Productos() throws Throwable {
        CambiarDireccion.MenuPrincial();
    }

    @Then("^Agrego un producto al carrito de compra$")
    public void agrego_un_producto_al_carrito_de_compra() throws Throwable {
        CambiarDireccion.AgregarProducto();
    }

    @Then("^Presiono Ver Carrito$")
    public void presiono_Ver_Carrito() throws Throwable {
        CambiarDireccion.PresionarVerCarrito();
    }

    @Then("^Presiono cambiar dirección$")
    public void presiono_cambiar_dirección() throws Throwable {
        CambiarDireccion.CambiarDireccion();
    }

    @Then("^Eligo otra dirección distinta a \\(Metropolitana de Santiago\\) en la selección desplegable$")
    public void eligo_otra_dirección_distinta_a_Metropolitana_de_Santiago_en_la_selección_desplegable() throws Throwable {
        CambiarDireccion.ElegirDireccion();
    }

    @Then("^Presiono actualizar$")
    public void presiono_actualizar() throws Throwable {
        CambiarDireccion.BotonActualizar();
    }

    @Then("^Se visualiza la pantalla correspondiente$")
    public void se_visualiza_la_pantalla_correspondiente() throws Throwable {
        CambiarDireccion.VerificarPantalla();
    }

}
