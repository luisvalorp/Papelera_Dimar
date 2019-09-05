package Steps;

import Commons.Base;
import Selenium.S_InicioSesion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps_InicioSesion {

    Base command = new Base();
    S_InicioSesion iniciarSesion = new S_InicioSesion();

    @Given("^Abro el navegador Chrome$")
    public void abro_el_navegador_Chrome() throws Throwable {
        command.AbrirNavegador();
    }

    @When("^Ingreso a la URL: https://dimar.wmeza.com$")
    public void ingreso_a_la_URL_https_dimar_wmeza_com() throws Throwable {
        command.AbrirURL();
    }

    @Then("^Carga el Home y presiono en la opción Acceder/Registrase$")
    public void carga_el_Home_y_presiono_en_la_opción_Acceder_Registrase() throws Throwable {
        iniciarSesion.ClickEnAcceder();
    }

    @Then("^Carga una ventana donde se puede ingresar el Usuario o Correo y contraseña, las agrego$")
    public void carga_una_ventana_donde_se_puede_ingresar_el_Usuario_o_Correo_y_contraseña_las_agrego() throws Throwable {
        iniciarSesion.AgregoCredenciales();
    }

    @Then("^Luego presiono el botón Acceder$")
    public void luego_presiono_el_botón_Acceder() throws Throwable {
        iniciarSesion.BotonAcceder();
    }

    @Then("^Se observa que inició sesión y se cierra el navegador$")
    public void se_observa_que_inició_sesión_y_se_cierra_el_navegador() throws Throwable {
        iniciarSesion.InicioyCierra();
    }
}
