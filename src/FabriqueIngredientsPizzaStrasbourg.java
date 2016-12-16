/**
 * Created by association on 16/12/16.
 */
public class FabriqueIngredientsPizzaStrasbourg implements FabriqueIngredientsPizza {
    @Override
    public Pate creerPate() {
        return new PateSoufflee();
    }

    @Override
    public Sauce creerSauce() {
        return new SauceTomateCerise();
    }

    @Override
    public Fromage creerFromage() {
        return new Mozzarella;
    }

    @Override
    public Legumes[] creerLegumes() {
        Legume legumes[] = {new Aubergine(), new Epinards(), new OlivesNoires()}
        return new Legumes[0];
    }

    @Override
    public Poivrons creerPoivrons() {
        return new PoivronsEnRondelles();
    }

    @Override
    public Moules creerMoules() {
        return new MoulesSurgelees();
    }
}
