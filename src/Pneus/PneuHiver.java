package Pneus;

public class PneuHiver extends Pneu {

    public PneuHiver(String marque, int largeurPneu, int indiceCapaciteCharge, int dateProduction, double indiceAdherence) {
        super(marque, largeurPneu, indiceCapaciteCharge, dateProduction, indiceAdherence);
    }

    // Vérifie l'adhérence du pneu, si elle n'est pas située dans une plage, renvoie une erreur
    public void checkAdherence() {
        if (indiceAdherence <= 0.7 || indiceAdherence >= 1) {
            throw new IllegalArgumentException("L'adhérence des pneus Toute Saison doit être située entre 0.7 et 1.");
        }
    }

}
