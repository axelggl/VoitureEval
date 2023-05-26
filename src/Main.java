import Pneus.PneuEte;
import Voitures.VoitureElectrique;

public class Main {
    public static void main(String[] args) {
        try {
            VoitureElectrique voitureElectrique = new VoitureElectrique("Tesla", 20000, "Model S", 5);
            PneuEte pneuEte = new PneuEte("Michelin", 220, 90, 2022, 0.6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}