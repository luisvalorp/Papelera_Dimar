package Steps;

import Commons.Base;
import Selenium.S_CuponVencido;
import cucumber.api.java.en.Then;

public class Step_CuponVencido extends Base {

    S_CuponVencido CuponVencido = new S_CuponVencido();

    @Then("^Agrego el código del cupón vencido$")
    public void agrego_el_código_del_cupón_vencido() throws Exception {
        CuponVencido.AgregarCodigoCuponVencido();
    }

    @Then("^Presiono el botón de Aplicar cupón vencido$")
    public void presiono_el_botón_de_Aplicar_cupón_vencido() throws Exception {
        CuponVencido.PresionarBotonAplicarCupVencido();
    }
}
