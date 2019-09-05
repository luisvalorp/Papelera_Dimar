package Steps;

import Commons.Base;
import Selenium.S_ActualizarCarrito;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps_ActualizarCarrito extends Base {


    Base comando = new Base();
    S_ActualizarCarrito ActualizarCarrito = new S_ActualizarCarrito();

    @Given("^Al Abrir el navegador Chrome$")
    public void al_Abrir_el_navegador_Chrome() throws Throwable {
        comando.AbrirNavegador();
    }

    @When("^Ingreso a dimar.meza.com$")
    public void ingreso_a_dimar_meza_com() throws Throwable {
        comando.AbrirURL();
    }

    @Then("^Ingreso a Producto en el menú principal$")
    public void ingreso_a_Producto_en_el_menú_principal() throws Throwable {
        ActualizarCarrito.IngresarMenuPrincipal();
    }

    @Then("^Agrego un producto al carrito presionando agregar a carrito$")
    public void agrego_un_producto_al_carrito_presionando_agregar_a_carrito() throws Throwable {
        ActualizarCarrito.AgregarProducto();
    }

    @Then("^Presiono el botón de Ver Carrito de la ventana emergente$")
    public void presiono_el_botón_de_Ver_Carrito_de_la_ventana_emergente() throws Throwable {
        ActualizarCarrito.PresionarVerCarritoCompra();
    }

    @Then("^Presiono el sigo de \\+ para añadir una cantidad más$")
    public void presiono_el_sigo_de_para_añadir_una_cantidad_más() throws Throwable {
        ActualizarCarrito.PresionarSignoMas();
    }

    @Then("^Presiono el botón de Actualizar Carrito$")
    public void presiono_el_botón_de_Actualizar_Carrito() throws Throwable {
        ActualizarCarrito.PresionarActualizarCarrito();
    }

    @Then("^Se ve un mensaje que dice: Carrito actualizado\\.$")
    public void se_ve_un_mensaje_que_dice_Carrito_actualizado() throws Throwable {
        ActualizarCarrito.MensajeActualizado();
    }


}
