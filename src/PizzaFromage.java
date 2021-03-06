/**
 * Created by association on 16/12/16.
 */
public class PizzaFromage extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaFromage(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
    }

}
