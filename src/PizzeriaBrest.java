/**
 * Created by association on 16/12/16.
 */
public class PizzeriaBrest extends Pizzeria {
    @Override
    Pizza creerPizza(String type) {
        switch (type) {
            case "fromage":
                return new PizzaFromageStyleBrest();
//            case "poivrons":
//                return new PizzaPoivronsStyleBrest();
//            case "fruitsDeMer":
//                return new PizzaFruitsDeMerStyleBrest();
//            case "vegetarienne":
//                return new PizzaVegetarienneStyleBrest();
            default:
                return null;
        }
    }
}
