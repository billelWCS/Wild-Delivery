public class Livreur {
    private String name;
    private Commande commandeEnCoursDeLivraison = null;
    public Livreur(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void commancerLivraison(Commande commande){
        System.out.println("Le Livreur " + getName() + " est en train de livrer la commande : "+commande.getName());
        this.commandeEnCoursDeLivraison = commande;
    }

    public void finirLivraison(){
        System.out.println("Le Livreur " + getName() + " a livré la commande : "+this.commandeEnCoursDeLivraison.getName());
        commandeEnCoursDeLivraison = null;
    }
}
