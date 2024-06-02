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
public class Revetement  {
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
    
      public int getId() {
        return idRevetement;
    }


    public String getDesignation() {
        return designation;
    }


    public boolean getMur() {
        return pourMur;
    }


    public boolean getSol() {
        return pourSol;
    }


    public boolean getPlafond() {
        return pourPlafond;
    }


    public double getPrix() {
        return prixUnitaire;
    }
    
    public double prix (int id){
        double prix;
        prix= id; // a changer 
        return prix;
    }

    public double RechercheRevetement(String nomfichier) {

   
        // Lecture du fichier texte
        List<Revetement> revêtements = lireRevêtementsFichier("cataloguerevetement.txt");


        // Recherche du revêtement
        Revetement revêtementTrouvé = null;
        for (Revetement revêtement : revêtements) {
            if (revêtement.getDesignation().equals(nomfichier)) {
                revêtementTrouvé = revêtement;
                break;
            }
        }

        // Affichage des résultats
        if (revêtementTrouvé != null) {
            System.out.println("Revêtement trouvé :");
            return revêtementTrouvé.getId();
            // ... autres informations à afficher
        } else {
            return -1;
        }
    }

    public static List<Revetement> lireRevêtementsFichier(String nomFichier)  {
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
        }
        return revêtements;
    }
}

