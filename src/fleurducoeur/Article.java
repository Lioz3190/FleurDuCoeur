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
public class Article {
    private String adresseImage;
    private double prix;

    public Article (String a, double p){
        this.adresseImage = a;
        this.prix = p;
    }
    
    public String getAdresseImage() {
        return adresseImage;
    }

    public void setAdresseImage(String adresseImage) {
        this.adresseImage = adresseImage;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
}
