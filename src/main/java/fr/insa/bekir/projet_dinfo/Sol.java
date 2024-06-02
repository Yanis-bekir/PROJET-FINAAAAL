/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;
import java.util.ArrayList;
import java.io.*;
import java.lang.Math;
import java.util.List;

public class Sol {
    //declaration des attributs de la classe Coin
    static int idSol;
  
    List<Coin> ListeCoins = new ArrayList<>();
    List<Revetement> ListeRevetements= new ArrayList<>();
    static List<Coin> ListeCoinss = new ArrayList<>();
    static List<Revetement> ListeRevetementss= new ArrayList<>();
    

    Sol(int id, List<Coin> Coins, List<Revetement> idRevetements){
    this.idSol=id;
    this.ListeCoins=Coins;
    this.ListeRevetements=idRevetements;
    this.ListeCoinss = Coins;
    this.ListeRevetementss = idRevetements;
    }
    public String afficher() {
        return "L'identifiant du sol est "+ idSol + ", la liste des coins est " + ListeCoins + "et la liste des revetements est " + ListeRevetements  ;
    }

    @Override
    public String toString() {
        return "Sol{" + "idSol=" + idSol + ", listeCoins=" + ListeCoins + ", ListeRevetements=" + ListeRevetements + '}';
    }

    public static int getIdSol() {
        return idSol;
    }

    public static void setIdSol(int idSol) {
        Sol.idSol = idSol;
    }

    public static List<Coin> getListeCoinss() {
        return ListeCoinss;
    }
    
    public List<Coin> getListeCoins() {
        return ListeCoins;
    }

    public static void setListeCoinss(ArrayList ListeCoins) {
        Sol.ListeCoinss = ListeCoins;
    }

    public static List<Revetement> getListeRevetementss() {
        return ListeRevetementss;
    }
    
    public  List<Revetement> getListeRevetements() {
        return ListeRevetements;
    }

    public static void setListeRevetements(ArrayList ListeRevetements) {
        Sol.ListeRevetementss = ListeRevetements;
    }
   
    public double surface() {
        double surface = 0;
        double sommex=0;
        double sommey=0;
        for (int i = 0; i<=ListeCoins.size() - 1; i++) {
            sommex = sommex + ListeCoins.get(i).getCx();
            sommey = sommey + ListeCoins.get(i).getCy();
        
}        
        double Moyennex = sommex/ListeCoins.size();
        double Moyenney = sommey/ListeCoins.size();

        for (int i = 0; i<=ListeCoins.size() - 1; i++) {
            double cote1 = Math.sqrt(Math.pow(Math.abs(ListeCoins.get(i).getCx()-ListeCoins.get(i+1).getCx()),2)+Math.pow(Math.abs(ListeCoins.get(i).getCy()-ListeCoins.get(i+1).getCy()),2));
            double cote2 = Math.sqrt(Math.pow(Math.abs(ListeCoins.get(i).getCx()-Moyennex),2)+Math.pow(Math.abs((ListeCoins.get(i).getCy()-Moyenney)),2));
            double cote3 = Math.sqrt(Math.pow(Math.abs(ListeCoins.get(i+1).getCx()-Moyennex),2)+Math.pow(Math.abs((ListeCoins.get(i+1).getCy()-Moyenney)),2));
            double p = (cote1+cote2+cote3)/2;
            double surfacetriangle = Math.sqrt(p*(p-cote1)*(p-cote2)*(p-cote3));
            surface = surface + surfacetriangle;
    }

        return surface;
    }
        public void sauvegardesol() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Sol " + ";" + Sol.getIdSol() + ";" + Sol.getListeCoinss() + ";" + Sol.getListeRevetementss() + "\n");
            }
        }
    public double montantRevetement(Sol sol){
        double PrixTotRevetement=0;
        for(int i=0; i<=ListeRevetements.size()-1;i++){
        PrixTotRevetement= PrixTotRevetement+ ListeRevetements.get(i).getPrix();
    }
    double montant=sol.surface()*PrixTotRevetement;
    
        return montant; 
}
       }


