/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;
import java.io.*;
/**
 *
 * @author hbogas01
 */
public class Coin {
    //declaration des attributs de la classe Coin
    static int idCoin;
    double cx;
    double cy;
   
    // Declaration du constructeur
    Coin(int id, double x,double y){
        this.idCoin=id;
        this.cx=x;
        this.cy=y;
    }
   
    void afficher(){
        System.out.println("identifiant du coin : " + this.idCoin+" Abcisse : "+ this.cx+" Ordonnée : "+ this.cy);
    }

    @Override
    public String toString() {
        return "Coin{" + "idCoin=" + idCoin + ", cx=" + cx + ", cy=" + cy + '}';
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }
    public void setIdCoin(int idCoin) {
        this.idCoin = idCoin;
    }

    public static double getIdCoin() {
        return idCoin;
    }
   
    public void setcdoublecx() {
        this.cx = cx;
    }

    public void setcy(double cy) {
        this.cy = cy;
    }
   
    public void sauvegardecoin() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Coin " + ";" + Coin.getIdCoin() + ";" + Coin.getC) + ";" + Coin.getCy() + "\n");
            }
        }
    }
 
