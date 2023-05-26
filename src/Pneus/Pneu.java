package Pneus;

public class Pneu {
    protected String marque;
    protected int largeurPneu;
    protected int indiceCapaciteCharge;
    protected int dateProduction;
    protected double indiceAdherence;

    public Pneu(String marque, int largeurPneu, int indiceCapaciteCharge, int dateProduction, double indiceAdherence) {
        this.marque = marque;
        this.largeurPneu = largeurPneu;
        this.indiceCapaciteCharge = indiceCapaciteCharge;
        this.dateProduction = dateProduction;
        this.indiceAdherence = indiceAdherence;
    }
}
