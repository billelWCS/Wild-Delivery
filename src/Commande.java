public class Commande {
    private String name;
    private Client client;
    private Restauant restauant;

    public Commande(String name, Client client,Restauant restauant) {
        this.name = name;
        this.client = client;
        this.restauant = restauant;
    }

    public String getName() {
        return name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restauant getRestauant() {
        return restauant;
    }

    public void setRestauant(Restauant restauant) {
        this.restauant = restauant;
    }
}
