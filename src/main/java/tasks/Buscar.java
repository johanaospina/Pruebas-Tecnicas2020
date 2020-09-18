package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.PaginaCompras;
import userinterface.PaginaInicio;

public class Buscar implements Task {

    private String BuscarArticulo;

    public Buscar(String BuscarArticulo){
        this.BuscarArticulo = BuscarArticulo;
    }

    public static Buscar producto(String BuscarArticulo){
        return Tasks.instrumented(Buscar.class,BuscarArticulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(BuscarArticulo).into(PaginaInicio.BOTON_BUSCAR)  ,
                Hit.the(Keys.ENTER).into(PaginaInicio.BOTON_BUSCAR),
                MoveMouse.to(PaginaCompras.IMAGEN)
        );
        actor.remember("precio", PaginaCompras.PRECIO.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(PaginaCompras.BOTON_MORE)
        );
    }
}
