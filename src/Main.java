public class Main {
    public static void main (String [] args){
        Restauant chezBillelEtFranck = new Restauant("Chez Billel Et Franck");
        Restauant chezDadou = new Restauant("chez Dadou");

        Client emir = new Client("Emir");
        Client mohammed = new Client("Mohammed");
        Client imen = new Client("Imen");

        Livreur nassim = new Livreur("Nassim");

        Commande commandeDeEmir = emir.passerCommande("Burger", chezDadou);
        Commande commandeDeImen = imen.passerCommande("Pizza", chezBillelEtFranck);
        Commande commandeDeMohammed = mohammed.passerCommande("Steack", chezDadou);

        chezBillelEtFranck.commencerCommande();
        chezDadou.commencerCommande();

        chezBillelEtFranck.finirCommande();
        nassim.commancerLivraison(chezDadou.finirCommande());
        chezDadou.commencerCommande();

        nassim.finirLivraison();

    }
}
