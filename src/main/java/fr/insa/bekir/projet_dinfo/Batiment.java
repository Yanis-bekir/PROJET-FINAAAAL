package fr.insa.bekir.projet_dinfo;

import java.util.ArrayList;
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ybekir01
 */
public class Batiment {
    static String idBatiment;
    static ArrayList listeNiveaux=new ArrayList<Niveau>();;

    Batiment(String id, ArrayList idNiveau) {
        this.idBatiment = id ;
        this.listeNiveaux = idNiveau ;
    }
    
    void afficher() {
        System.out.println("Identifiant : " + this.idBatiment+ " List : " + this.listeNiveaux);
    }
    
   
    void lireBatiment{
}
    void devisbatiment{
}
    void dessiner{
}
    public void sauvegardeBatiment() throws Exception{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Sauvegarde.txt"))) {
            // Écriture des revêtements dans le fichier
            writer.write("Batiment " + ";" + Batiment.getIdBatiment() + ";" + Batiment.getListeNiveaux() + "\n");
            }
        }
}