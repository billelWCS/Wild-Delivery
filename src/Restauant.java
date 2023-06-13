import java.util.ArrayList;
import java.util.List;

public class Restauant {
    private String name;
    private List<Commande> commandesEnAttenteDePreparation = new ArrayList<>();
    private List<Commande> commandesEnCoursDePreparation = new ArrayList<>();
    private List<Commande> commandesEnAttenteDeLivraison = new ArrayList<>();
//    private List<Commande> commandesEnCoursDeLivraison = new ArrayList<>();

    public Restauant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void receptionnerCommande (Commande commande){
        commandesEnAttenteDePreparation.add(commande);
        System.out.println("Le restaurant "+this.getName()+" a reçu la commande : " + commande.getName());
    }

    // commencer la préparation d'une nouvelle commande
    public Commande commencerCommande (){
        Commande commande = commandesEnAttenteDePreparation.remove(0);
        commandesEnCoursDePreparation.add(commande);
        System.out.println("Le restaurant "+this.getName()+" a commencé la préparation de la commande : " + commande.getName());
        return commande;
    }

    // finir la préparation d'une commande
    public Commande finirCommande (){
        Commande commande = commandesEnCoursDePreparation.remove(0);
        commandesEnAttenteDeLivraison.add(commande);
        System.out.println("La commande " + commande.getName() + " est prête et en attente de livraison");
        return commande;
    }

}
