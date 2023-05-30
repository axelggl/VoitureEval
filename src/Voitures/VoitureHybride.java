package Voitures;

import Pneus.Pneu;
import Pneus.PneusTouteSaison;

public class VoitureHybride extends Voiture {

    private static int autonomieMax = 800;

    public VoitureHybride(String marque, int kilometrage, String modele, int chevauxFiscaux) {
        super(marque, kilometrage, modele, autonomieMax, chevauxFiscaux);
    }

    // Override de la méthode addPneu pour ajouter l'exception spécifique à la voiture hybride : renvoie une erreur si le bon pneu n'est pas équipé
    @Override
    public void addPneu(Pneu pneu) throws Exception {
        if (!(pneu instanceof PneusTouteSaison)) {
            throw new Exception("Une voiture hybride ne peut avoir que des pneus Toute Saison !");
        }
        super.addPneu(pneu);
    }

}
