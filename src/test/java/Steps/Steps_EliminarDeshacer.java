package Steps;

import Selenium.S_EliminarDeshacer;
import cucumber.api.java.en.Then;

public class Steps_EliminarDeshacer {

    S_EliminarDeshacer eliminarDeshacer = new S_EliminarDeshacer();

    @Then("^Presiono la opción deshacer$")
    public void presiono_la_opción_deshacer() throws Exception {
        eliminarDeshacer.PresionarDeshacer();
    }

    @Then("^Verifico el producto que estaba anteriormente y salgo$")
    public void verifico_el_producto_que_estaba_anteriormente_y_salgo() throws Exception {
        eliminarDeshacer.VerificarProducto();
    }
}
