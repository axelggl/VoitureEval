package Pneus;

public class PneuHiver extends Pneu {

    public PneuHiver(String marque, int largeurPneu, int indiceCapaciteCharge, String dateProduction, int indiceAdherence) {
        super(marque, largeurPneu, indiceCapaciteCharge, dateProduction, indiceAdherence);
        if (indiceAdherence <= 0.7 || indiceAdherence >= 1) {
            throw new IllegalArgumentException("L'adhérence des pneus Toute Saison doit être située entre 0.7 et 1.");
        }
    }



}
