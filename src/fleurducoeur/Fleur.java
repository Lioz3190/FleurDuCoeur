/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleurducoeur;

/**
 *
 * @author Lioz-MBPR
 */
public class Fleur extends Article {
    private String name;
    private String categorie;
    private String couleur;
    private int note;
    
    public Fleur (String n, float p, String cat, String col, String adr) {
        super(adr,p);
        this.name = n;
        this.categorie = cat;
        this.couleur = col;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    
}
