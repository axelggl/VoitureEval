package Pneus;

public class PneuEte extends Pneu {

    public PneuEte(String marque, int largeurPneu, int indiceCapaciteCharge, String dateProduction, int indiceAdherence) {
        super(marque, largeurPneu, indiceCapaciteCharge, dateProduction, indiceAdherence);
    }

    public void checkAdherence() {
        if (indiceAdherence < 0.4 || indiceAdherence > 0.7) {
            throw new IllegalArgumentException("L'adhérence des pneus Toute Saison doit être située entre 0.4 et 0.7.");
        }
    }

}
