package Pneus;

public class PneuHiver extends Pneu{

    public PneuHiver(String marque, int largeurPneu, int indiceCapaciteCharge, String dateProduction, int indiceAdherence) {
        super(marque, largeurPneu, indiceCapaciteCharge, dateProduction, indiceAdherence);
        if (indiceAdherence < 0.7 || indiceAdherence > 1);
        throw new IllegalArgumentException("L'indice d'aderation des pneus toute saison ont une adhérence 0.7 et 1");
    }

}
