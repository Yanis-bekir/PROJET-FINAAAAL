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
public class Pièce {
    static int idPiece;
    static Sol sol;
    static Plafond plafond;
    static ArrayList listeMurs=new ArrayList<Mur>();
    private MainPane vue;


   Pièce(int idPiece,Sol sol, Plafond plafond, ArrayList<Mur> idmurs){
        this.idPiece = idPiece ;
        this.sol = sol ; 
        this.plafond = plafond ; 
        this.listeMurs = idmurs ;
        this.vue = v;
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

    public static ArrayList getListeMurs() {
        return listeMurs;
    }

    public static void setListeMurs(ArrayList listeMurs) {
        Pièce.listeMurs = listeMurs;
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
   }
   
   public void sauvegardepièce() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Pièce " + ";" + Pièce.getIdPiece() + ";" + Pièce.getSol() + ";" + Pièce.getPlafond() + ";" + Pièce.getListeMurs() + "\n");
            }
        }
   
       public void dessinerPiece(){
            for (int i=0;i<this.vue.getModel().size();i++) {
             Text text = new Text("Rec " + (i+1));
                StackPane stack = new StackPane();
             Rectangle rectangle = new Rectangle();
                rectangle.setX(this.vue.getModel().get(i).getCx());
                rectangle.setY(this.vue.getModel().get(i).getCy());
                rectangle.setWidth(this.vue.getModel().get(i).getLar());
                rectangle.setHeight(this.vue.getModel().get(i).getLon());
                rectangle.setStroke(Color.BLACK);
                rectangle.setFill(Color.WHITE); 

                stack.setAlignment(Pos.CENTER);
                stack.getChildren().addAll(rectangle, text);
                stack.setLayoutX(this.vue.getModel().get(i).getCx());
                stack.setLayoutY(this.vue.getModel().get(i).getCy());

                this.vue.getEspace_affichage().getChildren().addAll(stack);
            } 
       }
}