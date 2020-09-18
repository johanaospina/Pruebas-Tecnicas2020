package tasks;

import model.DatosIngreso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import userinterface.PaginaInicio;


public class IngresoRegistrarse implements Task {

    private DatosIngreso datosIngreso;

    public IngresoRegistrarse(DatosIngreso datosIngreso){
        this.datosIngreso=datosIngreso;
    }

    public static IngresoRegistrarse datosingreso (DatosIngreso datosingreso) {
       // return new IngresoRegistrarse(datosingreso);
        return Tasks.instrumented(IngresoRegistrarse.class,datosingreso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Ingreso datos Loguin
        actor.attemptsTo(
                Click.on(PaginaInicio.MOD_Resgistrarse),
                Enter.theValue(datosIngreso.getEmail()).into(PaginaInicio.CAMPO_Email),
                Click.on(PaginaInicio.BOTON_CrearCuenta)
        );
         actor.attemptsTo(
                Check.whether(PaginaInicio.MENSAJE_CUENTA_CREADA.resolveFor(actor).isVisible()).andIfSo(
                        Enter.theValue(datosIngreso.getEmail()).into(PaginaInicio.CAMPO_Email1),
                        Enter.theValue(datosIngreso.getContrasena()).into(PaginaInicio.CAMPO_Comtrasena),
                        Click.on(PaginaInicio.BOTON_INGRESAR)
                ).otherwise(
                        Enter.theValue(datosIngreso.getNombre()).into(PaginaInicio.CAMPO_Nombre),
                        Enter.theValue(datosIngreso.getApellido()).into(PaginaInicio.CAMPO_Apellido),
                        Enter.theValue(datosIngreso.getContrasena()).into(PaginaInicio.CAMPO_Comtrasena),
                        Enter.theValue(datosIngreso.getNombre()).into(PaginaInicio.CAMPO_Nombre1),
                        Enter.theValue(datosIngreso.getApellido()).into(PaginaInicio.CAMPO_Apellido1),
                        Enter.theValue(datosIngreso.getEmpresa()).into(PaginaInicio.CAMPO_Empresa),
                        Enter.theValue(datosIngreso.getDomicilio()).into(PaginaInicio.CAMPO_Domicilio),
                        Enter.theValue(datosIngreso.getCiudad()).into(PaginaInicio.CAMPO_Ciudad),
                        SelectFromOptions.byVisibleText(datosIngreso.getEstado()).from(PaginaInicio.CAMPO_Estado),
                        Enter.theValue(datosIngreso.getCodigopostal()).into(PaginaInicio.CAMPO_CodigoPostal),
                        SelectFromOptions.byVisibleText(datosIngreso.getPais()).from(PaginaInicio.CAMPO_Pais),
                        Enter.theValue(datosIngreso.getTelefonodeCasa()).into(PaginaInicio.CAMPO_TelCasa),
                        Enter.theValue(datosIngreso.getTelefonoMovil()).into(PaginaInicio.CAMPO_Celular),
                        Enter.theValue(datosIngreso.getAlias()).into(PaginaInicio.CAMPO_Alias),
                        Click.on(PaginaInicio.BOTON_Registar)
                )

        );




    }













}
