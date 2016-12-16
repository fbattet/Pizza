import java.util.ArrayList;

/**
 * Created by association on 16/12/16.
 */
public abstract class Pizza {
    String nom;
    String pate;
    String sauce;
    ArrayList garnitures = new ArrayList();

    void preparer() {
        System.out.println("Préparation de " + nom);
        System.out.println("Étalage de la pâte...");
        System.out.println("Ajout de la sauce...");
        System.out.println("Ajout de la garniture: ");
        for (int i = 0; i < garnitures.size(); i++) {
            System.out.println("\t" + garnitures.get(i));
        }
    }
    void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }

    void couper() {
        System.out.println("Découpage en parts triangulaires");
    }

    void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    public String getNom() {
        return nom;
    }
}

