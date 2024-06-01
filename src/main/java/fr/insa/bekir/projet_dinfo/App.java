package fr.insa.bekir.projet_dinfo;
import java.util.ArrayList;
import java.io.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.media.AudioClip;
import java.io.*;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) throws IOException {
        launch();
        int ON;
        String Sauvegarde;
        String Nom = "";
                
        System.out.println("Voulez vous accéder à votre sauvegarde? (1=Oui; 2=Non)");
        ON=Lire.i();
        
        if (ON == 1){
            System.out.println("Quels est le nom du fichier?");
            Sauvegarde = Lire.S();
             String fichier = Sauvegarde;

            // Création d'un objet FileReader pour lire le fichier
            FileReader fr = new FileReader(fichier);

            // Création d'un objet BufferedReader pour lire le fichier ligne par ligne
            BufferedReader br = new BufferedReader(fr);

            // Lecture du fichier ligne par ligne
            String ligne;
            for (int i = 1; (ligne = br.readLine()) != null; i++) {
            
                while ((ligne = br.readLine()) != null) {
                    Nom = ligne.split(" ")[0];
                }
                
                if (Nom == "Coin"){
                    
                     String[] elements = ligne.split(";");
                     Coin(Integer.parseInt(elements[1]),Integer.parseInt(elements[2]),Integer.parseInt(elements[3]));
                
                }
                
            System.out.println("Ligne " + i + " : " + ligne);
            
            }
            while ((ligne = br.readLine()) != null) {
                premierMot = ligne.split(" ")[0];
            }
            
            
            if (premierMot == "Coin"){
             
                
            }
            br.close();
            fr.close();
            
        }
        if (ON==0){
            System.out.println("Quel est le nom du batiment");
            String Denomination=Lire.S();
            ArrayList Niveau= new ArrayList<Niveau>();
            Batiment batiment= new Batiment(Denomination,Niveau);
            int j=0;
            int n=0;
            int p=0;
            int q=0;
            // quand le bouton creer niveau presser
            System.out.println("Quelle est la hauteur sous-plafond de ce niveau?");
            double hsf=Lire.d();
            ArrayList Appartement= new ArrayList<Appartement>();
            Niveau RDC=new Niveau(j,hsf,Appartement);
            Niveau.add(RDC);
            j=j+1;
            int k=0;
            //creer appartement
            ArrayList Piece= new ArrayList<Pièce>();
            Appartement salle=new Appartement(k,j,Piece);
            Appartement.add(salle);
            k=k+1;
            int l=0;
            //creer Piece
            ArrayList coin= new ArrayList<Coin>();
            ArrayList Mur= new ArrayList<Mur>();
            int m=0;
            
            ArrayList revetements= new ArrayList<Revetement>();
            //creer coin
            System.out.println("Donner la coordonnée en x du coin ?");
            double cx=Lire.d();
            System.out.println("Donner la coordonnée en x du coin ?");
            double cy=Lire.d();
            Coin coinm= new Coin(m,cx,cy);
            coin.add(coinm);
            m=m+1;
            //Fin création coin
            // creer mur
            revetements.clear();
            int o=0;
            // Ajouter un revetement
            System.out.println("Quel revetement voulez vous rajoutez ?");
            String recherche= Lire.S();
            revetements.add();
            System.out.println("Combien de fenêtres a ce mur ?");
            int nbrfenetre=Lire.i();
            System.out.println("Combien de porte à ce mur?");
            int nbrporte=Lire.i();
            // selection des coins debut et fin avec le menu deroulant
            Mur mur+String.valueOf(n)= new Mur(n,coinfin,coindebut,nbrporte,nbrfenetre,revetements);
            Mur.add(mur[n]);
            n=n+1;n
            //fin creation mur
            // creer plafond
            revetements.clear();
            int o=0;
            
            revetements.add();
            Plafond plafond=New Plafond(p,coin,revetements);
            p=p+1;
            //fin creation plafond
                    // creer sol
            revetements.clear();
            int o=0;
            
            revetements.add();
            Sol sol=New Sol(q,coin,revetements);
            q=q+1;
            //fin creation sol
            Pièce piece=new Pièce(l,sol,plafond,Mur,);
            Piece.add(piece);
            
            
            
            
        }
        
    }

}