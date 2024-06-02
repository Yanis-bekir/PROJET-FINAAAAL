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
    static int idCoins;
    int idCoin;
    double cx;
    double cy;
    static double cxs;
    static double cys;
   
    // Declaration du constructeur
    Coin(int id, double x,double y){
        this.idCoin=id;
        this.cx=x;
        this.cy=y;
        this.cxs=x;
        this.cys=y;
        this.idCoins=id;
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
    
    public static double getCxs() {
        return cxs;
    }
    
    public static double getCys() {
        return cys;
    }
    
    public static int getIdCoins() {
        return idCoins;
    }

    public double getCy() {
        return cy;
    }
    public void setIdCoin(int idCoin) {
        this.idCoin = idCoin;
    }

    public  double getIdCoin() {
        return idCoin;
    }
   
    public void setcdoublecx(double cx) {
        this.cx = cx;
    }

    public void setcy(double cy) {
        this.cy = cy;
    }
   
    public void sauvegardecoin() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Coin " + ";" + Coin.getIdCoins() + ";" + Coin.getCxs() + ";" + Coin.getCys() + "\n");
            }
        }
    
    }
 
