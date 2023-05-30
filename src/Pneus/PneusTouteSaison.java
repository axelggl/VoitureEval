package Pneus;

public class PneusTouteSaison extends Pneu {

    public PneusTouteSaison(String marque, int largeurPneu, int indiceCapaciteCharge, int dateProduction, double indiceAdherence) {
        super(marque, largeurPneu, indiceCapaciteCharge, dateProduction, indiceAdherence);
    }

    // Vérifie l'adhérence du pneu, si elle n'est pas située dans une plage, renvoie une erreur
    public void checkAdherence() {
        if (indiceAdherence < 0.1 || indiceAdherence > 0.4) {
            throw new IllegalArgumentException("L'adhérence des pneus Toute Saison doit être située entre 0.1 et 0.4.");
        }
    }

}
