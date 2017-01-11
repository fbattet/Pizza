/**
 * Created by association on 11/01/17.
 */
public class PizzaFruitsDeMer extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaFruitsDeMer(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        moules = fabriqueIngredients.creerMoules();
    }
}
