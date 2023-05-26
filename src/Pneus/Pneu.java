package Pneus;

public class Pneu {
    protected String marque;
    protected int largeurPneu;
    protected int indiceCapaciteCharge;
    protected String dateProduction;
    protected int indiceAdherence;

    public Pneu(String marque, int largeurPneu, int indiceCapaciteCharge, String dateProduction, int indiceAdherence) {
        this.marque = marque;
        this.largeurPneu = largeurPneu;
        this.indiceCapaciteCharge = indiceCapaciteCharge;
        this.dateProduction = dateProduction;
        this.indiceAdherence = indiceAdherence;
    }
}
