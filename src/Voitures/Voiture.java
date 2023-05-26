package Voitures;

import Pneus.Pneu;
import Pneus.PneuHiver;
import Pneus.PneusTouteSaison;

import java.util.ArrayList;
import java.util.List;

public class Voiture {
    private String marque;
    private int kilometrage;
    private String modele;
    private int autonomieMax;
    List<Pneu> pneus = new ArrayList<>();
    private int chevauxFiscaux;

    public Voiture(String marque, int kilometrage, String modele, int autonomieMax, int chevauxFiscaux) {
        this.marque = marque;
        this.kilometrage = kilometrage;
        this.modele = modele;
        this.autonomieMax = autonomieMax;
        this.chevauxFiscaux = chevauxFiscaux;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAutonomieMax() {
        return autonomieMax;
    }

    public void setAutonomieMax(int autonomieMax) {
        this.autonomieMax = autonomieMax;
    }

    public int getChevauxFiscaux() {
        return chevauxFiscaux;
    }

    public void setChevauxFiscaux(int chevauxFiscaux) {
        this.chevauxFiscaux = chevauxFiscaux;
    }

    // La méthode addPneu va ajouter des pneus à une voiture, elle vérifie aussi que le nombre de pneus est correct,
    // ainsi que si la voiture peut être équipée d'un certain type de pneus.
    public void addPneu(Pneu pneu, Voiture voiture) throws Exception {
        if (pneus.size() > 4) {
            throw new Exception("La voiture doit avoir 4 pneus, pas plus !");
        }
        if (pneus.size() < 4) {
            throw new Exception("La voiture doit avoir 4 pneus, pas moins !");
        }
        if (pneu instanceof PneuHiver && voiture instanceof VoitureElectrique) {
            throw new Exception("Une voiture électrique ne peut pas posséder de pneus Hiver !");
        }
        if (!(pneu instanceof PneusTouteSaison) && voiture instanceof VoitureHybride) {
            throw new Exception("Une voiture hybride ne peut posséder que des pneus Toute Saison !");
        }
        pneus.add(pneu);
    }

}
