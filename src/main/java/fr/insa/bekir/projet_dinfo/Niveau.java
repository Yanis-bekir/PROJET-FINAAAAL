package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;

public class Niveau {
   static int idNiveau;
   static double hauteurSousPlafond ;
   static ArrayList ListeAppart=new ArrayList<Appartement>(); ;

   Niveau(int id, double idhsp, ArrayList listappart){
        this.idNiveau = id ;
        this.hauteurSousPlafond = idhsp ;
        this.ListeAppart = listappart ;
    }
   void afficher() {
       System.out.println("identifiant du niveau : " + this.idNiveau +" hauteur sous plafond : "+ this.hauteurSousPlafond+" Liste des appartements : "+ this.ListeAppart );
   }

    public static int getIdNiveau() {
        return idNiveau;
    }

    public static void setIdNiveau(int idNiveau) {
        Niveau.idNiveau = idNiveau;
    }

    public static double getHauteurSousPlafond() {
        return hauteurSousPlafond;
    }

    public static void setHauteurSousPlafond(double hauteurSousPlafond) {
        Niveau.hauteurSousPlafond = hauteurSousPlafond;
    }

    public static ArrayList getListeAppart() {
        return ListeAppart;
    }

    public static void setListeAppart(ArrayList ListeAppart) {
        Niveau.ListeAppart = ListeAppart;
    }
   
   

    @Override
    public String toString() {
        return "Niveau{" + "idNiveau=" + idNiveau + ", hauteurSousPlafond=" + hauteurSousPlafond + ", ListeAppart=" + ListeAppart + '}';
    }
   
   double surfaceNiveau() {
        double s=0 ;
        for (int i = 0; i<=ListeAppart.size() - 1; i++) {
          s=s+ListeAppart.get(i).surfaceAppartement() ;
        }
       return s ;
   }
    
    double montantRevetement() {
        double prix=0 ;
       for (int i = 0; i<=ListeAppart.size() - 1; i++) {
           prix=prix+ListeAppart.get(i).montantRevetement();
       }
       return prix ;
   }
   }
   
   public void sauvegardeNiveau() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Niveau " + ";" + Niveau.getIdNiveau() + ";" + Niveau.getHauteurSousPlafond() + ";" + Niveau.getListeAppart() + "\n");
            }
        }
}