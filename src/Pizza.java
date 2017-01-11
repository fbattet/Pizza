import java.util.ArrayList;

/**
 * Created by association on 16/12/16.
 */
public abstract class Pizza {
    String nom;
    Pate pate;
    Sauce sauce;
    Legume legumes[];
    Fromage fromage;
    Poivrons poivrons;
    Moules moules;

    ArrayList garnitures = new ArrayList();

    abstract void preparer();

    void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }

    void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom + " " + pate + " " + sauce;
    }
}

