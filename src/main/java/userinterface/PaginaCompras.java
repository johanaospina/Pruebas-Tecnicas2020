package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCompras {

    public static final Target PRECIO= Target.the("el precio").
            locatedBy("//div[@class='product-image-container']//span[@class='price product-price']");

    public static final Target IMAGEN= Target.the("imagen producto").
            locatedBy("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']");

    public static final Target BOTON_MORE= Target.the("boton more").
            locatedBy("//span[contains(text(),'More')]");

    public static final Target PRECIO_FINAL= Target.the("precio final").
            located(By.id("our_price_display"));
}
