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
      public double montantRevetement (Plafond plafond, Revetement revetements){
        double montant=plafond.surface()*revetements.getPrix();
        return montant; 
    }
            
    public void sauvegardeplafond() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Plafond " + ";" + Plafond.getIdPlafond() + ";" + Plafond.getListeCoins() + ";" + Plafond.getListeRevetements() + "\n");
            }
        }
        
}
