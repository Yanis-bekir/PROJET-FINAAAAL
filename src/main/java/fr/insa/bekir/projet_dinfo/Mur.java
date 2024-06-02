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
public class Mur { 
    
    public static int idmur;
    public static Coin coindebut;
    public static Coin coinfin;
    public static int nbrPortes;
    public static int nbrFenetre;
    List<Revetement> ListeRevetements = new ArrayList<>();
    static List<Revetement> ListeRevetementss = new ArrayList<>();
    static Niveau niveau;
    
    
    Mur(int id, Coin coindebut, Coin coinfin, int nbrPortes, int nbrFenetre, List<Revetement> idRevetement,Niveau niveau) {
    this.idmur = id;
    this.coindebut = coindebut;
    this.coinfin = coinfin;
    this.nbrFenetre = nbrFenetre;
    this.nbrPortes = nbrPortes;
    this.ListeRevetements = idRevetement;
    this.niveau = niveau;
    }

    public static int getIdmur() {
        return idmur;
    }

    public static void setIdmur(int idmur) {
        Mur.idmur = idmur;
    }

    public static Coin getCoindebut() {
        return coindebut;
    }

    public static void setCoindebut(Coin coindebut) {
        Mur.coindebut = coindebut;
    }

    public static Coin getCoinfin() {
        return coinfin;
    }

    public static void setCoinfin(Coin coinfin) {
        Mur.coinfin = coinfin;
    }

    public static int getNbrPortes() {
        return nbrPortes;
    }

    public static void setNbrPortes(int nbrPortes) {
        Mur.nbrPortes = nbrPortes;
    }

    public static int getNbrFenetre() {
        return nbrFenetre;
    }

    public static void setNbrFenetre(int nbrFenetre) {
        Mur.nbrFenetre = nbrFenetre;
    }

    public static List<Revetement> getListeRevetements() {
        return ListeRevetementss;
    }

    public void setListeRevetements(ArrayList ListeRevetements) {
        this.ListeRevetements = ListeRevetements;
    }
    
    public void afficher(){
        System.out.println("identifiant du mur : " + this.idmur+" Coin debut : "+ this.coindebut +" Coin fin : "+ this.coinfin + " Nombre de fenêtres : " + this.nbrFenetre + " Nombre de portes" + this.nbrPortes + " id revetement : " + this.ListeRevetements);
    }

  
    @Override
    public String toString() {
        return "Mur{" + "idmur=" + idmur + ", coindebut=" + coindebut + ", coinfin=" + coinfin + ", nbrPortes=" + nbrPortes + ", nbrFenetre=" + nbrFenetre + ", ListeRevetements=" + ListeRevetements + '}';
    }
    
    public double surface (){
       double s=Math.sqrt(Math.pow(coinfin.getCx()-coindebut.getCx(),2)+Math.pow(coinfin.getCy()-coindebut.getCy(),2))*niveau.getHauteurSousPlafond();
       return s;
    }
    
    public double montantRevetement (Mur mur){
        double montant = 0 ;
        for (int i=0;i<=ListeRevetements.size();i++){
        montant=mur.surface()*ListeRevetements.get(i).getPrix()-nbrFenetre*Fenetre.surfacefenetre();
      
    }
        return montant;
   }
    public void sauvegardemur() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Mur " + ";" + Mur.getIdmur() + ";" + Mur.getCoindebut() + ";" + Mur.getCoinfin() + ";" + Mur.getNbrPortes() + ";" + Mur.getNbrFenetre() + ";" + Mur.getListeRevetements() + "\n");
            }
        }
}
