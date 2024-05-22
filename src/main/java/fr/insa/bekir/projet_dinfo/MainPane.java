package  fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class MainPane extends VBox {
    
    private ArrayList<Pièce> model;
    private PrimaryController controleur;
    
    private Label longueur;
    private Label largeur;
    private Label cx;
    private Label cy;
    private Label surface;
    private Label surface_val;
    
    private TextField lon;
    private TextField lar;
    private TextField cx_val;
    private TextField cy_val;
    
    private Button bt_ajouter;
    private Button bt_sauvegarder;
    private Button bt_dessiner;

    private GridPane pane_saisiedesinfo;
    private Pane espace_affichage;

    public GridPane getPane_saisiedesinfo() {
        return pane_saisiedesinfo;
    }

    public void setPane_saisiedesinfo(GridPane pane_saisiedesinfo) {
        this.pane_saisiedesinfo = pane_saisiedesinfo;
    }
    
    public Pane getEspace_affichage() {
        return espace_affichage;
    }

    public void setEspace_affichage(Pane espace_affichage) {
        this.espace_affichage = espace_affichage;
    }

    public ArrayList<Rec> getModel() {
        return model;
    }

    public void setModel(ArrayList<Rec> model) {
        this.model = model;
    }

    public Controleur getControleur() {
        return controleur;
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public Label getLongueur() {
        return longueur;
    }

    public void setLongueur(Label longueur) {
        this.longueur = longueur;
    }

    public Label getLargeur() {
        return largeur;
    }

    public void setLargeur(Label largeur) {
        this.largeur = largeur;
    }

    public Label getCx() {
        return cx;
    }

    public void setCx(Label cx) {
        this.cx = cx;
    }

    public Label getCy() {
        return cy;
    }

    public void setCy(Label cy) {
        this.cy = cy;
    }

    public Label getSurface() {
        return surface;
    }

    public void setSurface(Label surface) {
        this.surface = surface;
    }

    public Label getSurface_val() {
        return surface_val;
    }

    public void setSurface_val(Label surface_val) {
        this.surface_val = surface_val;
    }

    public TextField getLon() {
        return lon;
    }

    public void setLon(TextField lon) {
        this.lon = lon;
    }

    public TextField getLar() {
        return lar;
    }

    public void setLar(TextField lar) {
        this.lar = lar;
    }

    public TextField getCx_val() {
        return cx_val;
    }

    public void setCx_val(TextField cx_val) {
        this.cx_val = cx_val;
    }

    public TextField getCy_val() {
        return cy_val;
    }

    public void setCy_val(TextField cy_val) {
        this.cy_val = cy_val;
    }

    public Button getBt_ajouter() {
        return bt_ajouter;
    }

    public void setBt_ajouter(Button bt_ajouter) {
        this.bt_ajouter = bt_ajouter;
    }

    public Button getBt_sauvegarder() {
        return bt_sauvegarder;
    }

    public void setBt_sauvegarder(Button bt_sauvegarder) {
        this.bt_sauvegarder = bt_sauvegarder;
    }

    public Button getBt_dessiner() {
        return bt_dessiner;
    }

    public void setBt_dessiner(Button bt_dessiner) {
        this.bt_dessiner = bt_dessiner;
    }
    
    public MainPane(ArrayList<Rec> m) {
        this.model = m;
        this.controleur = new Controleur(this);
        
        this.longueur = new Label("Longueur:");
        this.largeur = new Label("Largeur:");
        this.cx = new Label("Cx:");
        this.cy = new Label("Cy:");
        this.surface = new Label("Surface rectangle:");
        this.surface_val = new Label("--:");
        
        this.lon = new TextField();
        this.lar = new TextField();
        this.cx_val = new TextField();
        this.cy_val = new TextField();
        
        this.pane_saisiedesinfo = new GridPane();
        this.pane_saisiedesinfo.setAlignment(Pos.CENTER);
        this.pane_saisiedesinfo.setHgap(5.5);
        this.pane_saisiedesinfo.setVgap(5.5);

        // Place nodes in the pane_saisiedesinfo at positions column,row
        this.pane_saisiedesinfo.add(this.longueur, 0, 0);
        this.pane_saisiedesinfo.add(this.lon, 1, 0);
        this.pane_saisiedesinfo.add(this.largeur, 0, 1);
        this.pane_saisiedesinfo.add(this.lar, 1, 1);
        this.pane_saisiedesinfo.add(this.cx, 0, 2);
        this.pane_saisiedesinfo.add(this.cx_val, 1, 2);
        this.pane_saisiedesinfo.add(this.cy, 0, 3);
        this.pane_saisiedesinfo.add(this.cy_val, 1, 3);
        this.pane_saisiedesinfo.add(this.surface, 0, 4);
        this.pane_saisiedesinfo.add(this.surface_val,1,4);

        // Bouton permettant d'ajouter un rectangle au model et de calculer sa surface.
        this.bt_ajouter = new Button("Ajouter rectangle");
        this.pane_saisiedesinfo.add(this.bt_ajouter, 0, 5);
        // Expression lambda pour construire un EventHandler<ActionEvent>
        this.bt_ajouter.setOnAction(evt -> {
            this.controleur.ajoutRec();
        });

        this.bt_sauvegarder = new Button("Sauvegarder rectangles");
        this.pane_saisiedesinfo.add(this.bt_sauvegarder, 1, 5);
        this.bt_sauvegarder.setOnAction(evt -> {
            this.controleur.sauvegarderRecs();
        });

        this.bt_dessiner = new Button("Dessiner rectangles");
        this.pane_saisiedesinfo.add(this.bt_dessiner, 2, 5);
        this.bt_dessiner.setOnAction(evt -> {
            this.controleur.dessinerRecs();
        });
        
        this.espace_affichage = new Pane();
        this.setPadding(new Insets(10, 50, 50, 50));
        this.setSpacing(10);
        this.getChildren().add(this.pane_saisiedesinfo);
        this.getChildren().add(this.espace_affichage);
    }
}
