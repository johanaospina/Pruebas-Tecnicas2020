package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("http://automationpractice.com/index.php")

public class PaginaInicio extends PageObject {

        //Loguin
        public static final Target MOD_Resgistrarse = Target.the("Registarse").located(By.xpath("//a[@class='login']"));
        public static final Target CAMPO_Email = Target.the("Campo Mail").located(By.id("email_create"));
        public static final Target BOTON_CrearCuenta = Target.the("Boton Crear Cuenta").located(By.id("SubmitCreate"));
        public static final Target CAMPO_Nombre = Target.the("Campo Nombre").located(By.id("customer_firstname"));
        public static final Target CAMPO_Apellido = Target.the("Campo Apellido").located(By.id("customer_lastname"));
        public static final Target CAMPO_Email1 = Target.the("Campo Email1").located(By.id("email"));
        public static final Target CAMPO_Comtrasena = Target.the("Campo Contraseña").located(By.id("passwd"));
        public static final Target CAMPO_Nombre1 = Target.the("Campo Nombre").located(By.id("firstname"));
        public static final Target CAMPO_Apellido1 = Target.the("Campo Nombre").located(By.id("lastname"));
        public static final Target CAMPO_Empresa = Target.the("Campo Empresa").located(By.id("company"));
        public static final Target CAMPO_Domicilio = Target.the("Campo Domicilio").located(By.id("address1"));
        public static final Target CAMPO_Ciudad = Target.the("Campo Ciudad").located(By.id("city"));
        public static final Target CAMPO_Estado = Target.the("Campo Estado").located(By.id("id_state"));
        public static final Target CAMPO_CodigoPostal = Target.the("Campo Codigo Posta").located(By.id("postcode"));
        public static final Target CAMPO_Pais = Target.the("Campo Pais").located(By.id("id_country"));
        public static final Target CAMPO_TelCasa = Target.the("Campo Tel Casa").located(By.id("phone"));
        public static final Target CAMPO_Celular = Target.the("Campo Celular").located(By.id("phone_mobile"));
        public static final Target CAMPO_Alias = Target.the("Campo Email Alias").located(By.id("alias"));
        public static final Target BOTON_Registar = Target.the("Boton Crear Registro").located(By.id("submitAccount"));
        public static final Target MENSAJE_CUENTA_CREADA = Target.the("Boton Ingresar Cuenta").located(By.id("create_account_error"));//public static final Target MENSAJE_CUENTA_CREADA = Target.the("Cuenta creada").locatedBy("//li[contains(text(),'{0}')]");
        public static final Target BOTON_INGRESAR = Target.the("Boton Ingresar Cuenta").located(By.id("SubmitLogin"));
        public static final Target BOTON_BUSCAR = Target.the("Boton Buscar").located(By.id("search_query_top"));



}
