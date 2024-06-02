/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;
import java.util.List;

/**
 *
 * @author ybekir01
 */
public class Appartement {
    static int idAppartement ;
    static int idNiveauAppartement ;
    List<Pièce> listePieces = new ArrayList<>();
    static List<Pièce> listePiecess = new ArrayList<>();
    
    public Appartement(int id, int idNiveau, ArrayList<Pièce> nbrpieces){
            this.idAppartement = id ; 
            this.idNiveauAppartement = idNiveau ;
            this.listePieces = nbrpieces ;
            this.listePiecess = nbrpieces;
    }

    public static int getIdAppartement() {
        return idAppartement;
    }

    public static void setIdAppartement(int idAppartement) {
        Appartement.idAppartement = idAppartement;
    }

    public static int getIdNiveauAppartement() {
        return idNiveauAppartement;
    }

    public static void setIdNiveauAppartement(int idNiveauAppartement) {
        Appartement.idNiveauAppartement = idNiveauAppartement;
    }

    public List<Pièce> getListePieces() {
        return listePieces;
    }
    
    static public List<Pièce> getListePiecess() {
        return listePiecess;
    }

    public static void setListePieces(ArrayList listePieces) {
        Appartement.listePiecess = listePieces;
    }
    
    double surfaceAppartement() {
        double s=0 ;
        for (int i = 0; i<=listePieces.size() - 1; i++) {
          s=s+listePieces.get(i).surfacePièce() ;
        }
       return s ;
   }
    
    double montantRevetement() {
        double prix=0 ;
       for (int i = 0; i<=listePieces.size() - 1; i++) {
           prix=prix+listePieces.get(i).montantRevetement();
       }
       return prix ;
   }
    
    
    public void sauvegardeAppartement() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Apartement " + ";" + Appartement.getIdAppartement() + ";" + Appartement.getIdNiveauAppartement() + ";" + Appartement.getListePiecess() + "\n");
            }
        }
}
