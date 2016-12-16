/**
 * Created by association on 16/12/16.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizzeria boutiqueStrabourg = new PizzeriaStrasbourg();

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("Luc à commander une " + pizza.getNom() + "\n");

        pizza = boutiqueStrabourg.commanderPizza("fromage");
        System.out.println("Michel a commandé une " + pizza.getNom() + "\n");

    }
}
