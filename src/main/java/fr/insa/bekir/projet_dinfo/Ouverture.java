/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

/**
 *
 * @author ybekir01
 */
public class Ouverture {
    static int idOuverture ;
    static double dimX ;
    static double dimY ;
   
public Ouverture(int id, double x, double y){
    this.idOuverture = id ;
    this.dimX = x ;
    this.dimY = y ;
}
     
    public static double surfaceouverture (){
        return dimY * dimX;
    }
}

