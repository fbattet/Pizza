/**
 * Created by association on 16/12/16.
 */
public class PizzeriaBrest extends Pizzeria {
    @Override
    protected Pizza creerPizza(String type) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaBrest();

        switch (type) {
            case "fromage":
                pizza = new PizzaFromage(fabriqueIngredients);
                pizza.setNom("Pizza au fromage style Brest");
                break;
            case "poivrons":
                pizza = new PizzaPoivrons(fabriqueIngredients);
                pizza.setNom("Pizza aux poivrons style Brest");
                break;
            case "fruitsDeMer":
                pizza = new PizzaFruitsDeMer(fabriqueIngredients);
                pizza.setNom("Pizza aux fruits de mer style Brest");
                break;
            case "vegetarienne":
                pizza = new PizzaVegetarienne(fabriqueIngredients);
                pizza.setNom("Pizza végétarienne style Brest");
                break;
        }
        return pizza;
    }
}
