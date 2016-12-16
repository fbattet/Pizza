/**
 * Created by association on 16/12/16.
 */
public class SimpleFabriqueDePizzas {
    public Pizza creerPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "fromage":
                pizza = new PizzaFromage();
                break;
//            case "poivrons":
//                pizza = new PizzaPoivrons();
//                break;
//            case "fruitsDeMer":
//                pizza =new PizzaFruitsDeMer();
//                break;
//            case "vegetarienne":
//                pizza = new PizzaVegetarienne();
//                break;
        }
        return pizza;
    }
}
