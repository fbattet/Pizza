/**
 * Created by association on 16/12/16.
 */
public class PizzeriaStrasbourg extends Pizzeria {
    @Override
    Pizza creerPizza(String type) {
        switch (type) {
            case "fromage":
                return new PizzaFromageStyleStrasbourg();
//            case "poivrons":
//                return new PizzaPoivronsStyleStrasbourg();
//            case "fruitsDeMer":
//                return new PizzaFruitsDeMerStyleStrasbourg();
//            case "vegetarienne":
//                return new PizzaVegetarienneStyleStrasbourg();
            default:
                return null;
        }
    }
}
