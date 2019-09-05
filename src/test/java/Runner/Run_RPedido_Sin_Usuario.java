package Runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/RealizarPedidoSinUsuario.feature"}, glue = "Steps")
public class Run_RPedido_Sin_Usuario {
}
