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
public class Batiment {
    static String idBatiment;
    static ArrayList listeNiveaux=new ArrayList<Niveau>();;

    Batiment(String id, ArrayList<Niveau> idNiveau) {
        this.idBatiment = id ;
        this.listeNiveaux = idNiveau ;
    }
    
    void afficher() {
        System.out.println("Identifiant : " + this.idBatiment+ " List : " + this.listeNiveaux);
    }

    public static String getIdBatiment() {
        return idBatiment;
    }

    public static void setIdBatiment(String idBatiment) {
        Batiment.idBatiment = idBatiment;
    }

    public static ArrayList getListeNiveaux() {
        return listeNiveaux;
    }

    public static void setListeNiveaux(ArrayList listeNiveaux) {
        Batiment.listeNiveaux = listeNiveaux;
    }
    
   
    void lireBatiment{
}
    void devisbatiment{
}
    void dessiner{
}
    double surfaceBatiment() {
        double s=0 ;
        for (int i = 0; i<=listeNiveaux.size() - 1; i++) {
          s=s+listeNiveaux.get(i).surfaceAppartement() ;
        }
       return s ;
   }
    
    double montantRevetement() {
        double prix=0 ;
       for (int i = 0; i<=listeNiveaux.size() - 1; i++) {
           prix=prix+listeNiveaux.get(i).montantRevetement();
       }
       return prix ;
   }
    public void sauvegardebatiment() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Batiment " + ";" + Batiment.getIdBatiment() + ";" + Batiment.getListeNiveaux() + "\n");
            }
        }
}