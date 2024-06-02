package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;
import java.util.List;

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
    List<Niveau> listeNiveaux = new ArrayList<>();
    static List<Niveau> listeNiveauxs = new ArrayList<>();

    Batiment(String id, ArrayList<Niveau> idNiveau) {
        this.idBatiment = id ;
        this.listeNiveaux = idNiveau ;
        this.listeNiveauxs = idNiveau;
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

    public static List<Niveau> getListeNiveauxs() {
        return listeNiveauxs;
    }
    
    public List<Niveau> getListeNiveaux() {
        return listeNiveaux;
    }

    public static void setListeNiveauxs(ArrayList listeNiveaux) {
        Batiment.listeNiveauxs = listeNiveaux;
    }
    
   

    double surfaceBatiment() {
        double s=0 ;
        for (int i = 0; i<=listeNiveaux.size() - 1; i++) {
          s=s+listeNiveaux.get(i).surfaceNiveau() ;
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
            writer.write("Batiment " + ";" + Batiment.getIdBatiment() + ";" + Batiment.getListeNiveauxs() + "\n");
            }
        }
}