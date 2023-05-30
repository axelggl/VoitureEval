package Voitures;

import Pneus.Pneu;
import Pneus.PneuHiver;

public class VoitureElectrique extends Voiture {

    private static int autonomieMax = 500;

    public VoitureElectrique(String marque, int kilometrage, String modele, int chevauxFiscaux) {
        super(marque, kilometrage, modele, autonomieMax, chevauxFiscaux);
    }

    // Override de la méthode addPneu pour ajouter l'exception spécifique à la voiture électrique : renvoie une erreur si le bon pneu n'est pas équipé
    @Override
    public void addPneu(Pneu pneu) throws Exception {
        if (pneu instanceof PneuHiver) {
            throw new Exception("Une voiture électrique ne peut pas être équipée de pneus Hiver !");
        }
        super.addPneu(pneu);
    }

}
