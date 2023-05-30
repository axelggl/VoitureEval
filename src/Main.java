import Pneus.PneuEte;
import Pneus.PneuHiver;
import Pneus.PneusTouteSaison;
import Voitures.VoitureDiesel;
import Voitures.VoitureElectrique;
import Voitures.VoitureEssence;
import Voitures.VoitureHybride;

public class Main {
    public static void main(String[] args) {
        VoitureElectrique voitureElectrique = new VoitureElectrique("Tesla", 20000, "Model S", 5);
        PneuEte pneuEte1 = new PneuEte("Michelin", 220, 90, 2022, 0.6);
        PneuHiver pneuHiver1 = new PneuHiver("Michelin", 220, 90, 2022, 0.8);
        try {
            voitureElectrique.addPneu(pneuEte1);
            voitureElectrique.addPneu(pneuEte1);
            voitureElectrique.addPneu(pneuEte1);
            voitureElectrique.addPneu(pneuHiver1); // Exception car un véhicule électrique ne peut avoir de pneu hiver.

            voitureElectrique.has4Wheels();
            voitureElectrique.maxKilometrage();
            voitureElectrique.validKilometrage();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage() + "\n");
        }

        VoitureHybride voitureHybride = new VoitureHybride("Toyota", 2000000, "CH-R", 4); // kilométrage trop élevé --> erreur
        PneusTouteSaison pneuTouteSaison1 = new PneusTouteSaison("Michelin", 200, 80, 2022, 0.3);
        try {
            voitureHybride.addPneu(pneuTouteSaison1);
            voitureHybride.addPneu(pneuTouteSaison1);
            voitureHybride.addPneu(pneuTouteSaison1);
            voitureHybride.addPneu(pneuTouteSaison1);

            voitureHybride.has4Wheels();
            voitureHybride.maxKilometrage();
            voitureHybride.validKilometrage();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage() + "\n");
        }

        VoitureDiesel voitureDiesel = new VoitureDiesel("Nissan", -100, "Juke", 4); // kilométrage négatif --> erreur
        PneuEte pneuEte2 = new PneuEte("Michelin", 200, 80,2018, 0.6);
        try {
            voitureDiesel.addPneu(pneuEte2);
            voitureDiesel.addPneu(pneuEte2);
            voitureDiesel.addPneu(pneuEte2);
            voitureDiesel.addPneu(pneuEte2);

            voitureDiesel.has4Wheels();
            voitureDiesel.maxKilometrage();
            voitureDiesel.validKilometrage();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage() + "\n");
        }

        VoitureEssence voitureEssence = new VoitureEssence("Ford", 2000, "C-MAX", 6);
        PneuHiver pneuHiver2 = new PneuHiver("Michelin", 250, 90, 2023, 0.8);
        try {
            voitureEssence.addPneu(pneuHiver2);
            voitureEssence.addPneu(pneuHiver2);
            voitureEssence.addPneu(pneuHiver2);

            voitureEssence.has4Wheels();
            voitureEssence.maxKilometrage();
            voitureEssence.validKilometrage();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage() + "\n");
        }

        System.out.println("Marque : "+ voitureElectrique.getMarque());
        System.out.println("Kilométrage : "+ voitureElectrique.getKilometrage());
        System.out.println("Modèle : "+ voitureElectrique.getModele());
        System.out.println("Chevaux Fiscaux : "+ voitureElectrique.getChevauxFiscaux());
        System.out.println("\n");
        System.out.println("Marque : "+ voitureHybride.getMarque());
        System.out.println("Kilométrage : "+ voitureHybride.getKilometrage());
        System.out.println("Modèle : "+ voitureHybride.getModele());
        System.out.println("Chevaux Fiscaux : "+ voitureHybride.getChevauxFiscaux());
        System.out.println("\n");
        System.out.println("Marque : "+ voitureDiesel.getMarque());
        System.out.println("Kilométrage : "+ voitureDiesel.getKilometrage());
        System.out.println("Modèle : "+ voitureDiesel.getModele());
        System.out.println("Chevaux Fiscaux : "+ voitureDiesel.getChevauxFiscaux());
        System.out.println("\n");
        System.out.println("Marque : "+ voitureEssence.getMarque());
        System.out.println("Kilométrage : "+ voitureEssence.getKilometrage());
        System.out.println("Modèle : "+ voitureEssence.getModele());
        System.out.println("Chevaux Fiscaux : "+ voitureEssence.getChevauxFiscaux());
    }
}