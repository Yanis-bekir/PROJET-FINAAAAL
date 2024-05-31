package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ybekir01
 */
public class Plafond {
    static int idPlafond;
    static ArrayList listeCoins;
    static ArrayList listeRevetements=new ArrayList<Revetement>();;
    
    Plafond(int id, ArrayList listeCoins, ArrayList idRevetement){
        this.idPlafond= id;
        this.listeCoins= listeCoins;
        this.listeRevetements = idRevetement;
    }

    public static int getIdPlafond() {
        return idPlafond;
    }

    public static void setIdPlafond(int idPlafond) {
        Plafond.idPlafond = idPlafond;
    }

    public static ArrayList getListeCoins() {
        return listeCoins;
    }

    public static void setListeCoins(ArrayList listeCoins) {
        Plafond.listeCoins = listeCoins;
    }

    public static ArrayList getListeRevetements() {
        return listeRevetements;
    }

    public static void setListeRevetements(ArrayList listeRevetements) {
        Plafond.listeRevetements = listeRevetements;
    }
    
    @Override
    public String toString() {
        return "Plafond{" + "idPlafond=" + idPlafond + ", listeCoins=" + listeCoins + ", listeRevetements=" + listeRevetements + '}';
    }
      public double montantRevetement (Plafond plafond){
          for (int i=0;i<=listeRevetements.size();i++){
        double montant=plafond.surface()*listeRevetements.get(i).getPrix();
        return montant; 
    }
          public double surface() {
        double surface = 0;
        double sommex=0;
        double sommey=0;
        for (int i = 0; i<=listeCoins.size() - 1; i++) {
            sommex = sommex + listeCoins.get(i).getCx();
            sommey = sommey + listeCoins.get(i).getCy();
        
}        
        double Moyennex = sommex/listeCoins.size();
        double Moyenney = sommey/listeCoins.size();

        for (int i = 0; i<=listeCoins.size() - 1; i++) {
            double cote1 = sqrt((Math.abs(listeCoins.get(i).getCx()-listeCoins.get(i+1).getCx()))**2+Math.abs((listeCoins.get(i).getCy()-listeCoins.get(i+1))**2));
            double cote2 = sqrt((Math.abs(listeCoins.get(i).getCx()-Moyennex))**2+Math.abs((listeCoins.get(i).getCy()-Moyenney)**2));
            double cote3 = = sqrt((Math.abs(listeCoins.get(i+1).getCx()-Moyennex))**2+Math.abs((listeCoins.get(i+1).getCy()-Moyenney)**2));
            double p = (cote1+cote2+cote3)/2;
            double surfacetriangle = Math.sqrt(p*(p-cote1)*(p-cote2)*(p-cote3));
            surface = surface + surfacetriangle;
    }

        return surface;
    }
            
    public void sauvegardeplafond() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Plafond " + ";" + Plafond.getIdPlafond() + ";" + Plafond.getListeCoins() + ";" + Plafond.getListeRevetements() + "\n");
            }
        }
        
}
