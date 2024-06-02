/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;
import java.util.List;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author ybekir01
 */
public class Pièce {
    static int idPiece;
    static Sol sol;
    static Plafond plafond;
    List<Mur> listeMurs = new ArrayList<>();
    static List<Mur> listeMurss = new ArrayList<>();


   Pièce(int idPiece,Sol sol, Plafond plafond, ArrayList<Mur> idmurs){
        this.idPiece = idPiece ;
        this.sol = sol ; 
        this.plafond = plafond ; 
        this.listeMurs = idmurs ;
        this.listeMurss = idmurs;
   }

    public static int getIdPiece() {
        return idPiece;
    }

    public static void setIdPiece(int idPiece) {
        Pièce.idPiece = idPiece;
    }

    public static Sol getSol() {
        return sol;
    }

    public static void setSol(Sol sol) {
        Pièce.sol = sol;
    }

    public static Plafond getPlafond() {
        return plafond;
    }

    public static void setPlafond(Plafond plafond) {
        Pièce.plafond = plafond;
    }

    public static List<Mur> getListeMurss() {
        return listeMurss;
    }
    
    public  List<Mur> getListeMurs() {
        return listeMurs;
    }

    public static void setListeMurss(ArrayList listeMurs) {
        Pièce.listeMurss = listeMurs;
    }
   
   
   void afficher() {
       System.out.println("identifiant de la pièce : " + this.idPiece+" sol : "+ this.sol + " plafond : "+ this.plafond + " identifiant du mur : " + this.listeMurs);
   }
    
   
   double surfacePièce() {
       return sol.surface();
   }
   
   double montantRevetement(){
       double prix=sol.montantRevetement(sol)+plafond.montantRevetement(plafond);
       for (int i = 0; i<=listeMurs.size() - 1; i++) {
           prix=prix+listeMurs.get(i).montantRevetement(listeMurs.get(i));
       }
       return prix;
   }
   
   public void sauvegardepièce() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Pièce " + ";" + Pièce.getIdPiece() + ";" + Pièce.getSol() + ";" + Pièce.getPlafond() + ";" + Pièce.getListeMurss() + "\n");
            }
        }
   
       
}