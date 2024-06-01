/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import com.mycompany.testjavafxsimple.test.Coin;
import com.mycompany.testjavafxsimple.test.Mur;
import com.mycompany.testjavafxsimple.test.Revetement.*;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
/**
 *
 * @author yanis
 */
public class MainPane extends BorderPane {

   private ArrayList<Mur> model;
   private Controleur controleur;
  
   
   private Label Cxt;
   private Label Cyt;
   private Label NbFenetre;
   private Label NbPortes;
   private Label NbTremis;
   
   private TextField Cx;
   private TextField Cy;
   private TextField Fichier;
   private TextField Fenetre;
   private TextField Porte;
   private TextField Tremis;
   
   private Button Piece;
   private Button Niveau;
   private Button Ajouter;
   private Button OuvrirSauvegarde;
   private Button Sauvegarde;
   private Button Dessiner;
   
   private ComboBox<String> Liste;
   
   private DessinCanvas cDessin;
   

   public MainPane (){
       
       this.controleur = new Controleur(this);

       

       this.Fichier = new TextField();
       this.OuvrirSauvegarde = new Button("Ouvrir Sauvegarde");
       this.OuvrirSauvegarde.setOnAction(evt -> {
            this.controleur.OuvrirSauvegarde();
        });
      
       VBox vbHaut = new VBox(this.Fichier, this.Sauvegarde, this.rbSelect);
       this.setTop(vbHaut);
       
       
   
       this.Piece = new Button("Nouvelle Pièce");
       this.Piece.setOnAction(evt -> {
            this.controleur
        });
       this.Niveau = new Button("Nouveau Niveau");
       this.Niveau.setOnAction(evt -> {
            this.controleur
        });
       this.NbFenetre = new Label("Nombres de fenêtre :");
       this.Fenetre = new TextField();
       this.NbPortes = new Label("Nombre de portes : ");
       this.Porte = new TextField();
       this.NbTremis = new Label ("Nombre de tremis :");
       this.Tremis = new TextField();
       
       this.Cyt = new Label("Cy");
       this.Cy = new TextField();
       this.Cxt = new Label("Cx");
       this.Cx= new TextField();
       this.Dessiner= new Button("Dessiner la pièce");
       this.Dessiner.setOnAction(evt -> {
            this.controleur.Dessinermur();
        });

       this.Ajouter = new Button("Ajouter");
       this.Ajouter.setOnAction(evt -> {
            this.controleur.Ajouter();
        });
       this.Sauvegarde = new Button("Sauvegarde");
       this.Sauvegarde.setOnAction(evt -> {
            this.controleur.Sauvegarde();
        });
       
       this.Liste = new ComboBox<>();
       Liste.getItems().addAll(lireRevetementsFichier("revetement"));

        Liste.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String selectedItem = Liste.getSelectionModel().getSelectedItem();
            System.out.println(selectedItem);
        }
    });
       
       VBox vbDroite = new VBox(this.NbFenetre, this.Fenetre, this.NbPortes, this.Porte, this.NbTremis, this.Tremis, this.Cyt, this.Cy, this.Cxt, this.Cxt, this.Ajouter, this.Sauvegarde, this.Dessiner);
       this.setRight(vbDroite);
       
       
       
       this.cDessin = new DessinCanvas(this);
       
       VBox vbCentre = new VBox(this.cDessin);
       this.setCenter(vbCentre);
       
       
       
   }

    /**
     * @return the model
     */
    public Groupe getModel() {
        return model;
    }

    /**
     * @return the controleur
     */
    public Controleur getControleur() {
        return controleur;
    }

    public TextField getCx() {
        return Cx;
    }

    public TextField getCy() {
        return Cy;
    }
    
}