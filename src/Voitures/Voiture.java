package Voitures;

import Pneus.Pneu;

import java.util.ArrayList;
import java.util.List;

public class Voiture {
    private String marque;
    private int kilometrage;
    private String modele;
    private int autonomieMax;
    private List<Pneu> pneus;
    private int chevauxFiscaux;

    public Voiture(String marque, int kilometrage, String modele, int autonomieMax, int chevauxFiscaux) {
        this.marque = marque;
        this.kilometrage = kilometrage;
        this.modele = modele;
        this.autonomieMax = autonomieMax;
        this.pneus = new ArrayList<>();
        this.chevauxFiscaux = chevauxFiscaux;
    }

    // Les différents Getters et Setters
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


    public void addPneu(Pneu pneu) throws Exception {
        pneus.add(pneu);
    }

    // Nouvelle contrainte, si le kilométrage est trop élevé, renvoie une erreur.
    public void maxKilometrage() throws Exception {
        if (kilometrage > 1000000) {
            throw new Exception("La voiture ne peut plus être utilisée, elle a un kilométrage trop élevé !");
        }
    }

    // Nouvelle contrainte, le kilométrage ne peut pas être négatif.
    public void validKilometrage() throws Exception {
        if (kilometrage < 0) {
            throw new Exception("La voiture possède un kilométrage négatif, la boite a été trafiquée, j'achète pas perso");
        }
    }

    // Permet de vérifier qu'un véhicule possède bien 4 roues, renvoie une erreur si ce n'est pas le cas.
    public void has4Wheels() {
        if (pneus.size() != 4) {
            throw new IllegalArgumentException("La voiture doit avoir 4 pneus !");
        }
    }
}
