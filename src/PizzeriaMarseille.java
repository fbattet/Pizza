/**
 * Created by association on 16/12/16.
 */
public class PizzeriaMarseille extends Pizzeria {
    @Override
    Pizza creerPizza(String type) {
        switch (type) {
            case "fromage":
                return new PizzaFromageStyleMarseille();
//            case "poivrons":
//                return new PizzaPoivronsStyleMarseille();
//            case "fruitsDeMer":
//                return new PizzaFruitsDeMerStyleMarseille();
//            case "vegetarienne":
//                return new PizzaVegetarienneStyleMarseille();
            default:
                return null;
        }
    }
}
