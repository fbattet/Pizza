/**
 * Created by association on 16/12/16.
 */
public class PizzaFromageStyleStrasbourg extends Pizza {
    public PizzaFromageStyleStrasbourg() {
        nom = "Pizza pâte style Strasbourg et fromage";
        pate = "Extra épaisse";
        sauce = "Sauce aux tomates cerise";

        garnitures.add("Lamelles de mozzarella");
    }

    void couper() {
        System.out.println("Découpage en parts carrées");
    }
}
