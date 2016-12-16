/**
 * Created by association on 16/12/16.
 */
public class PizzaFromage extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredientsPizza;

    public PizzaFromage(FabriqueIngredientsPizza fabriqueIngredientsPizza) {
        this.fabriqueIngredientsPizza = fabriqueIngredientsPizza;
    }

    @Override
    void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredientsPizza.creerPate();
        sauce = fabriqueIngredientsPizza.creerSauce();
        fromage = fabriqueIngredientsPizza.creerFromage();
    }

}
