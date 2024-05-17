/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

/**
 *
 * @author ybekir01
 */
public class Porte extends Ouverture {

    public Porte(double idOuverture ,double hauteur, double largeur) {
        super(idOuverture, dimY, dimX);
    }
   
    public double surfaceporte (){
       dimY = 2.1;
       dimX = 0.9;
       return dimY*dimX;
    }

}
