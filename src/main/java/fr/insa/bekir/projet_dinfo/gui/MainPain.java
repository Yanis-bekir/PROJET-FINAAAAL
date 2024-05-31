/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo.gui;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
/**
 *
 * @author yanis
 */
public class MainPain extends BorderPane {
    
    
   private RadioButton rbSelect;
   private RadioButton rbPoint;
   private RadioButton rbSegment;
   
   private Button bGroupe;
   private Button bCouleur;
   
   
   private DessinCanvas1 cDessin;
   
   public MainPain (){
       this.rbSelect= new RadioButton("Select");
       this.rbPoint = new RadioButton("Point");
       this.rbSegment = new RadioButton("Segement");
       
       VBox vbGauche = new VBox(this.rbSelect, this.rbPoint, this.rbSegment);
       this.setLeft(vbGauche);
       
       
       this.bGroupe= new Button("");
       this.bGroupe.setOnAction;
       this.bCouleur = new Button("");
       
       VBox vbDroite = new VBox(this.bGroupe, this.bCouleur);
       this.setRight(vbDroite);
       
       this.cDessin = new DessinCanvas1(200,200);
       
       VBox vbCentre = new VBox(this.cDessin);
       this.setCenter(vbCentre);
       
       
       
   }
    
}
