package Pneus;

public class PneuEte extends Pneu{

    public PneuEte(String marque, int largeurPneu, int indiceCapaciteCharge, String dateProduction, int indiceAdherence) {
        super(marque, largeurPneu, indiceCapaciteCharge, dateProduction, indiceAdherence);
        if (indiceAdherence < 0.4 || indiceAdherence > 0.7);
        throw new IllegalArgumentException("L'indice d'aderation des pneus toute saison ont une adhérence 0.4 et 0.7");

    }

}