package Steps;

import Commons.Base;
import Selenium.S_EliminarProducto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_EliminarProducto extends Base {

    Base comando = new Base();
    S_EliminarProducto EliminarProducto = new S_EliminarProducto();


    @Given("^Inicio el navegador Chrome$")
    public void inicio_el_navegador_Chrome() throws Throwable {
        comando.AbrirNavegador();
    }

    @When("^Entro al sitio dimar.meza.com$")
    public void entro_al_sitio_dimar_meza_com() throws Throwable {
        comando.AbrirURL();
    }

    @Then("^Entro en el menú principal en la opción de Productos$")
    public void entro_en_el_menú_principal_en_la_opción_de_Productos() throws Throwable {
        EliminarProducto.MenuProductos();
    }

    @Then("^Luego realizo click en el botón de Agregar a Carrito$")
    public void luego_realizo_click_en_el_botón_de_Agregar_a_Carrito() throws Throwable {
        EliminarProducto.AgregarCarritoP();
    }

    @Then("^En la ventana emergente presiono el botón de Ver Carrito$")
    public void en_la_ventana_emergente_presiono_el_botón_de_Ver_Carrito() throws Throwable {
        EliminarProducto.BotonVerCarrito();
    }

    @Then("^Al cargar la pantalla hago click en el Icono de X para eliminar$")
    public void al_cargar_la_pantalla_hago_click_en_el_Icono_de_X_para_eliminar() throws Throwable {
        EliminarProducto.EliminarProducto();
    }

    @Then("^Verfico el mensaje correspondiente con la opción de ¿Deshacer\\?\\.$")
    public void verfico_el_mensaje_correspondiente_con_la_opción_de_Deshacer() throws Throwable {
        EliminarProducto.VerificarMensaje();
    }
}
