package Pneus;

public class PneusTouteSaison extends Pneu{

    public PneusTouteSaison(String marque, int largeurPneu, int indiceCapaciteCharge, String dateProduction, int indiceAdherence) {
    super(marque, largeurPneu, indiceCapaciteCharge, dateProduction, indiceAdherence);
    if (indiceAdherence < 0.1 || indiceAdherence > 0.4);
    throw new IllegalArgumentException("L'indice d'aderation des pneus toute saison ont une adhérence 0.1 et 0.4");
    }
}
