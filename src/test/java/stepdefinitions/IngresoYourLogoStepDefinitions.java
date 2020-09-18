package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosIngreso;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.Verificar;
import tasks.Buscar;
import tasks.IngresoRegistrarse;
import userinterface.PaginaInicio;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;


public class IngresoYourLogoStepDefinitions {

    @Managed (driver = "chrome")
    private WebDriver suNavegador;


    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("que el (.*) ingrese a la url")
    public void queeleclienteingresealaurl(String user) {
        OnStage.theActorCalled(user).attemptsTo(Open.browserOn().the(PaginaInicio.class));
    }

    @When("^crea una cuenta con los datos$")
    public void creaunacuenta(List<DatosIngreso> datosIngreso) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoRegistrarse.datosingreso(datosIngreso.get(0)));
    }

    @And("^busca un producto y lo agrega al carrito$")
    public void buscaUnProductoYLoAgregaAlCarrito(List<String> producto)   {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.producto(producto.get(0)));

    }

    @Then("^verifica que el precio sea el correcto$")
    public void verificaQueElPrecioSeaElCorrecto()   {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Verificar.precio(),
                equalTo(OnStage.theActorInTheSpotlight().recall("precio")))
        );
    }

}