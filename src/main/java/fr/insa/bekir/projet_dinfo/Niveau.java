package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;

public class Niveau extends Batiment {
   int idNiveau;
   double hauteurSousPlafond ;
   ArrayList ListeAppart=new ArrayList<Appartement>(); ;

   Niveau(int id, double idhsp, ArrayList listappart){
        this.idNiveau = id ;
        this.hauteurSousPlafond = idhsp ;
        this.ListeAppart = listappart ;
    }
   void afficher() {
       
   }

    @Override
    public String toString() {
        return "Niveau{" + "idNiveau=" + idNiveau + ", hauteurSousPlafond=" + hauteurSousPlafond + ", ListeAppart=" + ListeAppart + '}';
    }
   
   void surface() {
       
   }
   void montantRevetement() {
       
   }
}