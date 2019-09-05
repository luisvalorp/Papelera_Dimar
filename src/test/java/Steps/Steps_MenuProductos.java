package Steps;

import Selenium.S_MenuProductos;
import cucumber.api.java.en.Then;

public class Steps_MenuProductos {
    S_MenuProductos menuProductos = new S_MenuProductos();

    @Then("^Visualizo todos los productos$")
    public void visualizo_todos_los_productos() throws Exception {
        menuProductos.MenuTodos();
    }

    @Then("^Visualizo todas las bolsas$")
    public void visualizo_todas_las_bolsas() throws Exception {
        menuProductos.MenuBolsas();
    }

    @Then("^Visualizo todas las cajas de pizzas$")
    public void visualizo_todas_las_cajas_de_pizzas() throws Exception {
        menuProductos.MenuCajasPizzas();
    }

    @Then("^Visualizo todas las cajas estandar$")
    public void visualizo_todas_las_cajas_estandar() throws Exception {
        menuProductos.MenuCajasEstandar();
    }

    @Then("^Visualizo todas las cajas aletas cortas$")
    public void visualizo_todas_las_cajas_aletas_cortas() throws Exception {
        menuProductos.MenuCajaAletasCortas();
    }

    @Then("^Visualizo todas las cajas aletas largas$")
    public void visualizo_todas_las_cajas_aletas_largas() throws Exception {
        menuProductos.MenuAletasLargas();
    }

    @Then("^Visualizo todas las cajas para botellas$")
    public void visualizo_todas_las_cajas_para_botellas() throws Exception {
        menuProductos.MenuCajaBotellas();
    }

    @Then("^Visualizo todas las cajas de separadores clásicos$")
    public void visualizo_todas_las_cajas_de_separadores_clásicos() throws Exception {
        menuProductos.MenuBotellaClasico();
    }

    @Then("^Visualizo todas las cajas de separadores especiales$")
    public void visualizo_todas_las_cajas_de_separadores_especiales() throws Exception {
        menuProductos.MenuBotellaEspeciales();
    }

    @Then("^Visualizo todas las cajas postales$")
    public void visualizo_todas_las_cajas_postales() throws Exception {
        menuProductos.MenuCajaPostales();
    }

    @Then("^Visualizo todas las cajas sin aletas$")
    public void visualizo_todas_las_cajas_sin_aletas() throws Exception {
        menuProductos.MenuCajaSinAletas();
    }

    @Then("^Visualizo todas las cajas wrap$")
    public void visualizo_todas_las_cajas_wrap() throws Exception {
        menuProductos.MenuCajaWrap();
    }
}
