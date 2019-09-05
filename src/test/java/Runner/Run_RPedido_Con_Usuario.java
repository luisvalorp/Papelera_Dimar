package Runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/RealizarPedido.feature"}, glue = "Steps")
public class Run_RPedido_Con_Usuario {
}
