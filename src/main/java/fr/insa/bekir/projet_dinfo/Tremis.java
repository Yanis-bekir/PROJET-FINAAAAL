/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

/**
 *
 * @author ybekir01
 */
public class Tremis extends Ouverture{
    
    public Tremis(int idOuverture, double hauteur, double largeur) {
        super(idOuverture, hauteur, largeur);
    }
    
    public static double surfacetremis (){
        dimY  =0.9;
        dimX  =0.9;

        return dimY* dimX;
    } 
}