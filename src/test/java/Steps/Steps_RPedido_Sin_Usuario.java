package Steps;

import Commons.Base;
import Selenium.S_RPedido_Sin_Usuario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_RPedido_Sin_Usuario extends Base {

    Base comando = new Base();
    S_RPedido_Sin_Usuario PedidoSinUsuario = new S_RPedido_Sin_Usuario();

    @Given("^Abro Chrome \\(Navegador\\)$")
    public void abro_Chrome_Navegador() throws Throwable {
        comando.AbrirNavegador();
    }

    @When("^Entro al website dimar\\.wmeza\\.com$")
    public void entro_al_website_dimar_wmeza_com() throws Throwable {
        comando.AbrirURL();
    }

    @Then("^Selecciono en el menú principal Productos$")
    public void selecciono_en_el_menú_principal_Productos() throws Throwable {
        PedidoSinUsuario.MenuPrinProducto();
    }

    @Then("^Agrego al carrito en el botón correspondiete$")
    public void agrego_al_carrito_en_el_botón_correspondiete() throws Throwable {
        PedidoSinUsuario.AgregarCarritoProd();
    }

    @Then("^Presiono en el botón de Ver Carrito$")
    public void presiono_en_el_botón_de_Ver_Carrito() throws Throwable {
        PedidoSinUsuario.EmergenteVerCarrito();
    }

    @Then("^Presiono el botón de Finalizar Compra$")
    public void presiono_el_botón_de_Finalizar_Compra() throws Throwable {
        PedidoSinUsuario.FinalizarCompra();
    }

    @Then("^Lleno el formulario del detalle de compra y presiono Realizar Pedido$")
    public void lleno_el_formulario_del_detalle_de_compra_y_presiono_Realizar_Pedido() throws Throwable {
        PedidoSinUsuario.LlenarFormulario();
    }

    @Then("^Verifico que me envíe a la URL de la forma de pago$")
    public void verifico_que_me_envíe_a_la_URL_de_la_forma_de_pago() throws Throwable {
        PedidoSinUsuario.VerificarPage();
    }

}
