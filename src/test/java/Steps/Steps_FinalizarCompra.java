package Steps;

import Commons.Base;
import Selenium.S_FinalizaCompra;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_FinalizarCompra extends Base {
    Base comando = new Base();
    S_FinalizaCompra FinalizarCompra = new S_FinalizaCompra();

    @Given("^Abrir el browser Chrome$")
    public void abrir_el_browser_Chrome() throws Throwable {
        comando.AbrirNavegador();
    }

    @When("^Abro la url dimar.meza.com$")
    public void abro_la_url_dimar_meza_com() throws Throwable {
        comando.AbrirURL();
    }

    @Then("^Ingreso en el menú principal en Productos$")
    public void ingreso_en_el_menú_principal_en_Productos() throws Throwable {
        FinalizarCompra.IngresarEnProductos();
    }

    @Then("^Luego presiono el botón de Agregar Carrito$")
    public void luego_presiono_el_botón_de_Agregar_Carrito() throws Throwable {
        FinalizarCompra.AgregarProducto();
    }

    @Then("^Presiono el botón de la ventana emergente de Ver Carrito$")
    public void presiono_el_botón_de_la_ventana_emergente_de_Ver_Carrito() throws Throwable {
        FinalizarCompra.ClickEnVerCarrito();
    }

    @Then("^Luego presiono el Botón Finalizar Compra y debe cargar la pantalla del Detalle.$")
    public void luego_presiono_el_Botón_Finalizar_Compra_y_debe_cargar_la_pantalla_del_Detalle() throws Throwable {
        FinalizarCompra.ClickFinalizarCompra();
    }
}
