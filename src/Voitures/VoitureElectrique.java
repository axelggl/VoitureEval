package Voitures;

public class VoitureElectrique extends Voiture {

    private static int autonomieMax = 500;

    public VoitureElectrique(String marque, int kilometrage, String modele, int chevauxFiscaux) {
        super(marque, kilometrage, modele, autonomieMax, chevauxFiscaux);
    }
}
