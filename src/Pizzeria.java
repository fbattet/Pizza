/**
 * Created by association on 16/12/16.
 */
public abstract class Pizzeria {
//    SimpleFabriqueDePizzas fabrique;
//
//    public Pizzeria(SimpleFabriqueDePizzas fabrique) {
//        this.fabrique = fabrique;
//    }

    public Pizza commanderPizza(String type) {
        Pizza pizza;
        pizza = creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();
        return pizza;
    }

    abstract Pizza creerPizza(String type);
}
