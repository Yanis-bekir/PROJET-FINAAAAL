/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author ybekir01
 */
public class Pièce extends Niveau{
    static int idPiece;
    static int sol;
    static int plafond;
    static ArrayList listeMurs=new ArrayList<Mur>();
    
    
   Pièce(int idNiveau, int id, int sol, int plafond, ArrayList idmurs){
        this.idPiece = id ;
        this.sol = sol ; 
        this.plafond = plafond ; 
        this.listeMurs = idmurs ;
   }

    public static int getIdPiece() {
        return idPiece;
    }

    public static void setIdPiece(int idPiece) {
        Pièce.idPiece = idPiece;
    }

    public static int getSol() {
        return sol;
    }

    public static void setSol(int sol) {
        Pièce.sol = sol;
    }

    public static int getPlafond() {
        return plafond;
    }

    public static void setPlafond(int plafond) {
        Pièce.plafond = plafond;
    }

    public static ArrayList getListeMurs() {
        return listeMurs;
    }

    public static void setListeMurs(ArrayList listeMurs) {
        Pièce.listeMurs = listeMurs;
    }
   
   
   void afficher() {
       System.out.println("identifiant de la pièce : " + this.idPiece+" sol : "+ this.sol + " plafond : "+ this.plafond + " identifiant du mur : " + this.listeMurs)
   }
    
   
   double surfacePièce() {
       return sol.surface();
   }
   double montantRevetement(){
       prix=sol.montantRevetement()+plafond.montantRevetement();
       for (int i = 0; i<=listeMurs.size() - 1; i++) {
           prix=prix+listeMurs.get(i).montantRevetement();
       }
   }
   
   public void sauvegardepièce() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Pièce " + ";" + Pièce.getIdPiece() + ";" + Pièce.getSol() + ";" + Pièce.getPlafond() + ";" + Pièce.getListeMurs() + "\n");
            }
        }
   
       public void dessinerRecs(){
            for (int i=0;i<this.vue.getModel().size();i++) {
             Text text = new Text("Rec " + (i+1));
                StackPane stack = new StackPane();
             Rectangle rectangle = new Rectangle();
                rectangle.setX(this.vue.getModel().get(i).getOri_x());
                rectangle.setY(this.vue.getModel().get(i).getOri_y());
                rectangle.setWidth(this.vue.getModel().get(i).getLar());
                rectangle.setHeight(this.vue.getModel().get(i).getLon());
                rectangle.setStroke(Color.BLACK);
                rectangle.setFill(Color.WHITE); 

                stack.setAlignment(Pos.CENTER);
                stack.getChildren().addAll(rectangle, text);
                stack.setLayoutX(this.vue.getModel().get(i).getOri_x());
                stack.setLayoutY(this.vue.getModel().get(i).getOri_y());

                this.vue.getEspace_affichage().getChildren().addAll(stack);
            } 
       }
}