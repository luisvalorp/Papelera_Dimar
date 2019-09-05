package Steps;

import Commons.Base;
import Selenium.S_CuponNoExiste;
import cucumber.api.java.en.Then;

public class Steps_CuponNoExiste extends Base {

    S_CuponNoExiste cuponNoExiste = new S_CuponNoExiste();

    @Then("^Agrego el código del cupón no existente$")
    public void agrego_el_código_del_cupón_no_existente() throws Exception {
        cuponNoExiste.AgregarCodigoCuponNoExistente();
    }
    @Then("^Presiono el botón de Aplicar cupón$")
    public void Presiono_el_botón_de_Aplicar_cupón() throws Exception {
        cuponNoExiste.PresionarBotonAplicarCuponNoExistente();
    }
}
