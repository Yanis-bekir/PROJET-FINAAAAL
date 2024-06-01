/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.testjavafxsimple.test.Coin;
import com.mycompany.testjavafxsimple.test.Mur;
import java.awt.Point;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.GRAY;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author yanis
 */
public class Controleur {
    
    private MainPane vue;
    private int idcoin = 0;
    static ArrayList  ListeCoin =new ArrayList<Coin>();
    private int idmur = 0;
    private int idpiece = 0;
    private int idsol = 0;
    private int idfenetre=0;
    
  
    
    
    public Controleur(MainPane vue){
        this.vue=vue;
    }
    
    
    public void ChangerEtat(int NouvelEtat){
        if (NouvelEtat==30){
            
        } 
        if (NouvelEtat==20){
            
        }
        if (NouvelEtat==10){
            
        }
        
    }
    
    public void ajoutCoin() {
        Coin ("coin"+ Integer.toString(idcoin)) = new Coin(Double.parseDouble(this.vue.getCx().getText()), Double.parseDouble(this.vue.getCy().getText()));
        this.vue.getModel().add(coin);
        // Calcul et affichage de la surface
        this.vue.getSurface_val().setText(Double.toString(rec.surface()));
        System.out.println("Rectangle : " + this.vue.getLon().getText() + " x " + this.vue.getLar().getText() + 
                           " (" + this.vue.getCx_val().getText() + "," + this.vue.getCy_val().getText()+") ajouté à la liste");
    }
    
    public void Pièce(int nbcoindebut, int nbcoinfin, int nbportes, int nbtremis, int nbfenetre){
        for (int i = nbcoindebut ;i<=nbcoinfin;i++){
            Mur mur= new(idmur, coin )
                    Mur(int id, Coin coindebut, Coin coinfin, int nbrPortes, int nbrFenetre, ArrayList idRevetement)
        }
    }
    
    public void ajoutMur() {
        Mur mur = new Mur(Double.parseDouble(this.vue.getLon().getText()), 
                          Double.parseDouble(this.vue.getLar().getText()), 
                          Double.parseDouble(this.vue.getCx_val().getText()),
                          Double.parseDouble(this.vue.getCy_val().getText()));
        this.vue.getModel().add(rec);
        // Calcul et affichage de la surface
        this.vue.getSurface_val().setText(Double.toString(rec.surface()));
        sauvegardecoin();
    }
    
    
    public void Dessinermur(){
        for (int i = 0; i < this.vue.getModel().size(); i++) {
            Line line = new Line();

            line.setStartX(vue.getModel().get(i).getOri_x(0));
            line.setStartY(vue.getModel().get(i).getOri_y());
            line.setEndX(vue.getModel().get(i).getOri_x(1));
            line.setEndY(vue.getModel().get(i).getOri_y(1));
            line.setStroke(Color.BLACK);
            line.setStrokeWidth(2.0);

            StackPane stack = new StackPane();
            stack.setAlignment(Pos.CENTER);
            stack.getChildren().add(line);

            stack.setLayoutX(vue.getModel().get(i).getOri_x());
            stack.setLayoutY(vue.getModel().get(i).getOri_y());

            this.vue.cDessin().getChildren().addAll(stack);
            
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
    
    public void dessinerTraits(){
    for (int i = 0; i < this.vue.getModel().size(); i++) {
        Line line = new Line();

        line.setStartX(vue.getModel().get(i).getOri_x(0));
        line.setStartY(vue.getModel().get(i).getOri_y());
        line.setEndX(vue.getModel().get(i).getOri_x(1));
        line.setEndY(vue.getModel().get(i).getOri_y(1));
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(2.0);

        StackPane stack = new StackPane();
        stack.setAlignment(Pos.CENTER);
        stack.getChildren().add(line);

        stack.setLayoutX(vue.getModel().get(i).getOri_x());
        stack.setLayoutY(vue.getModel().get(i).getOri_y());

        this.vue.getEspace_affichage().getChildren().addAll(stack);
    }
}

    
}
