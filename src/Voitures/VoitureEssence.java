package Voitures;

public class VoitureEssence extends Voiture {

    private static int autonomieMax = 1000;

    public VoitureEssence(String marque, int kilometrage, String modele, int chevauxFiscaux) {
        super(marque, kilometrage, modele, autonomieMax, chevauxFiscaux);
    }



}
