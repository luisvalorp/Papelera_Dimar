package Steps;

import Commons.Base;
import Selenium.S_CuponValido;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_CuponValido {

    Base commad = new Base();
    S_CuponValido cuponValido = new S_CuponValido();

    @Given("^Abrí el navegador Chrome$")
    public void abrí_el_navegador_Chrome() throws Throwable {
        commad.AbrirNavegador();
    }

    @When("^Entro en la url: http://dimar\\.wmeza\\.com/$")
    public void entro_en_la_url_http_dimar_wmeza_com() throws Throwable {
        commad.AbrirURL();
    }

    @Then("^En el menú principal Ingreso en la opción de productos$")
    public void en_el_menú_principal_Ingreso_en_la_opción_de_productos() throws Throwable {
        cuponValido.IngresarEnProductos();
    }

    @Then("^Selecciono un producto y presiono el botón Añadir Carrito$")
    public void selecciono_un_producto_y_presiono_el_botón_Añadir_Carrito() throws Throwable {
        cuponValido.SeleccionarProducto();
    }

    @Then("^Aparece una ventana donde presiono Ver Carrito$")
    public void aparece_una_ventana_donde_presiono_Ver_Carrito() throws Throwable {
        cuponValido.PresionarVerCarrito();
    }

    @Then("^Agrego el código del cupón$")
    public void agrego_el_código_del_cupón() throws Throwable {
        cuponValido.AgregarCodigoCupon();
    }

    @Then("^Presiono el botón de Aplicar cupón donde agrega monto descuento y lo resta con el subtotal y actualiza el total$")
    public void presiono_el_botón_de_Aplicar_cupón_donde_agrega_monto_descuento_y_lo_resta_con_el_subtotal_y_actualiza_el_total() throws Throwable {
        cuponValido.PresionarBotonAplicarCupon();
    }

    @Then("^Salir$")
    public void salir() throws Throwable {
        cuponValido.Salir();
    }


}
