package Voitures;

public class VoitureDiesel extends Voiture {

    private static int autonomieMax = 1000;

    public VoitureDiesel(String marque, int kilometrage, String modele, int chevauxFiscaux) {
        super(marque, kilometrage, modele, autonomieMax, chevauxFiscaux);
    }



}
