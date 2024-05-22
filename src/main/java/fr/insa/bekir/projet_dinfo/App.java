package fr.insa.bekir.projet_dinfo;

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
        String premierMot = "";
                
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
                    premierMot = ligne.split(" ")[0];
                }
                
                if (premierMot == "Coin"){
                    
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
        
        
    }

}