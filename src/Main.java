import Pneus.Pneu;
import Pneus.PneuEte;
import Pneus.PneusTouteSaison;
import Voitures.Voiture;
import Voitures.VoitureElectrique;
import Voitures.VoitureHybride;

public class Main {
    public static void main(String[] args) {
        try {
            VoitureElectrique voitureElectrique = new VoitureElectrique("Tesla", 20000, "Model S", 5);
            PneuEte pneuEte1 = new PneuEte("Michelin", 220, 90, 2022, 0.6);
            PneuEte pneuEte2 = new PneuEte("Michelin", 220, 90, 2022, 0.6);
            PneuEte pneuEte3 = new PneuEte("Michelin", 220, 90, 2022, 0.6);
            PneuEte pneuEte4 = new PneuEte("Michelin", 220, 90, 2022, 0.6);
            voitureElectrique.addPneu(pneuEte1);
            voitureElectrique.addPneu(pneuEte2);
            voitureElectrique.addPneu(pneuEte3);
            voitureElectrique.addPneu(pneuEte4);

            VoitureHybride voitureHybride = new VoitureHybride("Toyota", 2000, "CH-R", 4);
            PneusTouteSaison pneusTouteSaison1 = new PneusTouteSaison("Michelin", 200, 80, 2022, 0.3);
            PneusTouteSaison pneusTouteSaison2 = new PneusTouteSaison("Michelin", 200, 80, 2022, 0.3);
            PneusTouteSaison pneusTouteSaison3 = new PneusTouteSaison("Michelin", 200, 80, 2022, 0.3);
            PneusTouteSaison pneusTouteSaison4 = new PneusTouteSaison("Michelin", 200, 80, 2022, 0.3);
            voitureHybride.addPneu(pneusTouteSaison1);
            voitureHybride.addPneu(pneusTouteSaison2);
            voitureHybride.addPneu(pneusTouteSaison3);
            voitureHybride.addPneu(pneusTouteSaison4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String afficherInfos(Voiture voiture) {
        System.out.println("Marque : " + voiture.getMarque());
        System.out.println("Kilométrage : " + voiture.getKilometrage());
        System.out.println("Modèle : " + voiture.getModele());
        System.out.println("Chevaux Fiscaux : " + voiture.getChevauxFiscaux());
        System.out.println("Pneus : ");
        for (Pneu pneu : voiture.)

        }
    }

}