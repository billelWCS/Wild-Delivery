public class Client {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client(String name) {
        this.name = name;
    }

    public Commande passerCommande (String commandeName, Restauant restauant){
        Commande commande = new Commande(commandeName, this, restauant);
        System.out.println(this.getName() + " passe la commande " +commande.getName() + " chez le restaurant "+ restauant.getName());
        restauant.receptionnerCommande(commande);
        return commande;
    }
}
