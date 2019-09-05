package Steps;

import Selenium.S_PedidoSinUsuarioFactura;
import cucumber.api.java.en.Then;

public class Steps_PedidoSinUsuarioFactura {
    S_PedidoSinUsuarioFactura PedidoFactura = new S_PedidoSinUsuarioFactura();

    @Then("^Lleno el formulario del detalle de compra con factura y presiono Realizar Pedido$")
    public void lleno_el_formulario_del_detalle_de_compra_con_factura_y_presiono_Realizar_Pedido() throws Exception {
        PedidoFactura.LlenarFormularioFactura();
    }
}
