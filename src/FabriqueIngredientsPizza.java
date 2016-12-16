/**
 * Created by association on 16/12/16.
 */
public interface FabriqueIngredientsPizza {
    public Pate creerPate();
    public Sauce creerSauce();
    public Fromage creerFromage();
    public Legumes[] creerLegumes();
    public Poivrons creerPoivrons();
    public Moules creerMoules();
}
