/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;

/**
 *
 * @author ybekir01
 */
public class Circulation{
    int idNiveau;
    int idCirculation;
    int sol;
    int plafond;
    ArrayList listeMurs=new ArrayList<Mur>();;
    
    Circulation(int idNiveau, int id, int sol, int plafond, ArrayList idmurs){
        this.idNiveau = idNiveau ;
        this.idCirculation = id ;
        this.sol = sol ; 
        this.plafond = plafond ; 
        this.listeMurs = idmurs ;
    }
}