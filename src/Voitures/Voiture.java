package Voitures;

import java.util.ArrayList;
import java.util.List;

public class Voiture {
    protected String marque;
    protected int kilometrage;
    protected String modele;
    protected int autonomieMax;
    List<Voiture> voiture = new ArrayList<>();
    protected int chevauxFiscaux;

    public Voiture(String marque, int kilometrage, String modele, int autonomieMax, int chevauxFiscaux) {
        this.marque = marque;
        this.kilometrage = kilometrage;
        this.modele = modele;
        this.autonomieMax = autonomieMax;
        this.chevauxFiscaux = chevauxFiscaux;
    }
}
