package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ybekir01
 */
public class Plafond {
    int idPlafond;
    ArrayList listeCoins;
    ArrayList listeRevetements=new ArrayList<Revetement>();;
    
    Plafond(int id, ArrayList listeCoins, ArrayList idRevetement){
        this.idPlafond= id;
        this.listeCoins= listeCoins;
        this.listeRevetements = idRevetement;
    }

    @Override
    public String toString() {
        return "Plafond{" + "idPlafond=" + idPlafond + ", listeCoins=" + listeCoins + ", listeRevetements=" + listeRevetements + '}';
    }
      public double montantRevetement (Plafond plafond, Revetement revetements){
        double montant=plafond.surface()*revetements.prix()-nbrFenetre*Fenetre.surface();
        return montant; 
    }
            
    
        
}
