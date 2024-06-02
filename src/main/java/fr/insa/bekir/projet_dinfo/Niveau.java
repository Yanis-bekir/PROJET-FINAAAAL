package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class Niveau  {
   int idNiveau;
   double hauteurSousPlafond ;
   List<Appartement> ListeAppart = new ArrayList<>();
   static List<Appartement> ListeApparts = new ArrayList<>();
   static int idNiveaus;
   static double hauteurSousPlafonds;

   Niveau(int id, double idhsp, List<Appartement> listappart){
        this.idNiveau = id ;
        this.hauteurSousPlafond = idhsp ;
        this.ListeAppart = listappart ;
        this.idNiveaus=id;
        this.hauteurSousPlafonds = idhsp;
        this.ListeApparts = listappart;
        
    }
   void afficher() {
       System.out.println("identifiant du niveau : " + this.idNiveau +" hauteur sous plafond : "+ this.hauteurSousPlafond+" Liste des appartements : "+ this.ListeAppart );
   }

    public int getIdNiveau() {
        return idNiveau;
    }
    
    public static int getIdNiveaus(){
        return idNiveaus;
    }

    public void setIdNiveaus(int idNiveau) {
        Niveau.idNiveaus = idNiveau;
    }

    public double getHauteurSousPlafond() {
        return hauteurSousPlafond;
    }
    
    public static double getHauteurSousPlafonds(){
        return hauteurSousPlafonds;
    }

    public void setHauteurSousPlafond(double hauteurSousPlafond) {
        Niveau.hauteurSousPlafonds = hauteurSousPlafond;
    }

    public List<Appartement> getListeAppart() {
        return ListeAppart;
    }
    
    public static List<Appartement> getListeApparts(){
        return ListeApparts;
    }

    public void setListeAppart(ArrayList ListeAppart) {
        Niveau.ListeApparts = ListeAppart;
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
           Appartement Appartement= ListeAppart.get(i);
           prix=prix+Appartement.montantRevetement();
           
       }
       return prix ;
   }
   
   
   public void sauvegardeNiveau() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Niveau " + ";" + Niveau.getIdNiveaus() + ";" + Niveau.getHauteurSousPlafonds() + ";" + Niveau.getListeApparts() + "\n");
            }
        }
}