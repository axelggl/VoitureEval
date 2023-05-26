package Voitures;

import java.util.ArrayList;
import java.util.List;

public class Voiture {
    private String marque;
    private int kilometrage;
    private String modele;
    private int autonomieMax;
    List<Voiture> pneus = new ArrayList<>();
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



}
