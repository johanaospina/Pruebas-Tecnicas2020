package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PaginaCompras;


public class Verificar implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaCompras.PRECIO_FINAL).viewedBy(actor).asString();
    }
    public static Verificar precio(){
        return new Verificar();
    }

}
