/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;

public class Sol {
    //declaration des attributs de la classe Coin
    static int idSol;
    static ArrayList ListeCoins = new ArrayList<Coin>();
    static ArrayList ListeRevetements =new ArrayList<Revetement>();

    Sol(int id, ArrayList Coins, ArrayList idRevetements){
    this.idSol=id;
    this.ListeCoins=Coins;
    this.ListeRevetements=idRevetements;
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

    public static ArrayList getListeCoins() {
        return ListeCoins;
    }

    public static void setListeCoins(ArrayList ListeCoins) {
        Sol.ListeCoins = ListeCoins;
    }

    public static ArrayList getListeRevetements() {
        return ListeRevetements;
    }

    public static void setListeRevetements(ArrayList ListeRevetements) {
        Sol.ListeRevetements = ListeRevetements;
    }
   
    public Double surface() {
        double surface = 0;

        for (int i = 0; i<=ListeCoins.size() - 1; i++) {
            double sommex = ListeCoins.get(i).getCx();
            double sommey = ListeCoins.get(i).getCy();
        
}        
        double Moyennex = sommex/ListeCoins.size();
        double Moyenney = sommey/ListeCoins.size();

        for (int i = 0; i<=ListeCoins.size() - 1; i++) {
            double cote1 = sqrt((Math.abs(ListeCoins.get(i).getCx()-ListeCoins.get(i+1).getCx()))**2+Math.abs((ListeCoins.get(i).getCy()-ListeCoins.get(i+1))**2));
            double cote2 = sqrt((Math.abs(ListeCoins.get(i).getCx()-Moyennex))**2+Math.abs((ListeCoins.get(i).getCy-Moyenney)**2));
            double cote3 = = sqrt((Math.abs(ListeCoins.get(i+1).getCx()-Moyennex))**2+Math.abs((ListeCoins.get(i+1).getCy()-Moyenney)**2));
            double p = (cote1+cote2+cote3)/2;
            double surfacetriangle = Math.sqrt(p*(p-cote1)*(p-cote2)*(p-cote3));
            surface = surface + surfacetriangle;
    }

        return surface;
    }
        public void sauvegardesol() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Sol " + ";" + Sol.getIdSol() + ";" + Sol.getListeCoins() + ";" + Sol.getListeRevetements() + "\n");
            }
        }

       }

    public Double montantRevetement() {
}
