package Steps;

import Selenium.S_SeguirComprando;
import cucumber.api.java.en.Then;

public class Steps_SeguirComprando {

    S_SeguirComprando seguirComprando = new S_SeguirComprando();

    @Then("^Presiono en el botón Seguir Comprando$")
    public void presiono_en_el_botón_Seguir_Comprando() throws Exception {
        seguirComprando.PresionarSeguirComprando();
    }
    @Then("^Selecciono un producto diferente y presiono el botón Añadir Carrito$")
    public void Selecciono_un_producto_diferente_y_presiono_el_botón_Añadir_Carrito() throws Exception {
        seguirComprando.ProductoDiferente();
    }
    @Then("^Verifico los elementos seleccionados y salgo$")
    public void verifico_los_elementos_seleccionados_y_salgo() throws Exception {
        seguirComprando.VerificarElementos();
    }
}
