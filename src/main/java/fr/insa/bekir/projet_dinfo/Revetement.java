/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;
import java.io.*;
import java.util.*;

/**
 *
 * @author ybekir01
 */
public class Revetement {
   int idRevetement;
   String designation;
   boolean pourMur;
   boolean pourSol;
   boolean pourPlafond;
   double prixUnitaire;
   
   
    Revetement(int id, String designation, boolean Mur, boolean Sol, boolean Plafond, double prixUnitaire) {
    this.idRevetement = id;
    this.designation = designation;
    this.pourMur = Mur;
    this.pourSol = Sol;
    this.pourPlafond = Plafond;
    this.prixUnitaire = prixUnitaire;
    }
    
    public double prix (int id){
        double prix;
        prix= id; // a changer 
        return prix;
    }

    public double RechercheRevetement(String nomfichier) {

   
        // Lecture du fichier texte
        List<Revetement> revêtements = lireRevêtementsFichier("revêtements.txt");

        String nomRecherche = nomfichier;

        // Recherche du revêtement
        Revetement revêtementTrouvé = null;
        for (Revetement revêtement : revêtements) {
            if (revêtement.getNom().equals(nomRecherche)) {
                revêtementTrouvé = revêtement;
                break;
            }
        }

        // Affichage des résultats
        if (revêtementTrouvé != null) {
            System.out.println("Revêtement trouvé :");
            System.out.println("Nom : " + revêtementTrouvé.getNom());
            System.out.println("Prix : " + revêtementTrouvé.getPrix());
            // ... autres informations à afficher
        } else {
            System.out.println("Revêtement non trouvé.");
        }
    }

    private static List<Revetement> lireRevêtementsFichier(String nomFichier) {
        List<Revetement> revêtements = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] champs = ligne.split(";");
                int id = Integer.parseInt(champs[0]);
                String nom = champs[1];
                boolean mur = champs[2].equals("1");
                boolean sol = champs[3].equals("1");
                boolean plafond = champs[4].equals("1");
                double prix = Double.parseDouble(champs[5]);

                Revetement revêtement = new Revetement(id, nom, mur, sol, plafond, prix);
                revêtements.add(revêtement);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return revêtements;
    }
}

