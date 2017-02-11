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
    private String taille;

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
    
    public Fleur (String n, double p, String cat, String col, String adr, int not, String t ) {
        super(adr,p);
        this.name = n;
        this.categorie = cat;
        this.couleur = col;
        this.note = not;
        this.taille = t;
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

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }
    
    
}
