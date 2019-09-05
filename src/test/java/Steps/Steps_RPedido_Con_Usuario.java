package Steps;

import Commons.Base;
import Selenium.S_RPedido_Con_Usuario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps_RPedido_Con_Usuario extends Base {

    Base comando = new Base();
    S_RPedido_Con_Usuario RealizarPedido = new S_RPedido_Con_Usuario();

    @Given("^Abrir Chrome$")
    public void abrir_Chrome() throws Throwable {
        comando.AbrirNavegador();
    }

    @When("^Ingreso a la dirección dimar\\.meza\\.com$")
    public void ingreso_a_la_dirección_dimar_meza_com() throws Throwable {
        comando.AbrirURL();
    }

    @Then("^Selecciono Productos en el menú principal$")
    public void selecciono_Productos_en_el_menú_principal() throws Throwable {
        RealizarPedido.SeleccionarProductoMenu();
    }

    @Then("^Agrego un producto en el botón Agregar a Carrito$")
    public void agrego_un_producto_en_el_botón_Agregar_a_Carrito() throws Throwable {
        RealizarPedido.AñadirCarrito();
    }

    @Then("^Realizo un click en Ver Carrito$")
    public void realizo_un_click_en_Ver_Carrito() throws Throwable {
        RealizarPedido.ClickVerCarritoEmergente();
    }

    @Then("^Realizo click en el botón Finalizar Compra$")
    public void realizo_click_en_el_botón_Finalizar_Compra() throws Throwable {
        RealizarPedido.PresionarBotonFinalizar();
    }

    @Then("^Hago click en ¿Ya eres Cliente\\? y agrego las Credenciales$")
    public void hago_click_en_Ya_eres_Cliente_y_agrego_las_Credenciales() throws Throwable {
        RealizarPedido.AgregarLasCredenciales();
    }

    @Then("^Presiono Acceder$")
    public void presiono_Acceder() throws Throwable {
        RealizarPedido.PresionarAccederBoton();
    }

    @Then("^Eligo la Región$")
    public void eligo_la_Región() throws Throwable {
        RealizarPedido.ElegirRegion();
    }

    @Then("^Presiono el botón de Realizar Pedido y espero que se visualice la pantalla de pago$")
    public void presiono_el_botón_de_Realizar_Pedido_y_espero_que_se_visualice_la_pantalla_de_pago() throws Throwable {
        RealizarPedido.PresionarRealizarPedido();
    }

}
