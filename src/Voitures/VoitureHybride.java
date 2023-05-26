package Voitures;

public class VoitureHybride extends Voiture {

    private static int autonomieMax = 800;

    public VoitureHybride(String marque, int kilometrage, String modele, int chevauxFiscaux) {
        super(marque, kilometrage, modele, autonomieMax, chevauxFiscaux);
    }



}
