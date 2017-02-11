/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleurducoeur;

import java.util.ArrayList;

/**
 *
 * @author Lioz-MBPR
 */
public class StateMachinePrix {
    private StatePrix myState;
   
    private ArrayList<ArticlePanel> liste;
    
    public StateMachinePrix (ArrayList listeArticles) {
        myState = StatePrix.POPULAIRE;
        liste = listeArticles;
    }
    
    public void setState (StatePrix state) {
        myState = state;
    }
    
    public void onMouseClickMoins30 () {
        switch (myState) {
            case POPULAIRE:
                setState(StatePrix.MOINS30);
                afficherBouquetsMoins30();
                break;
            case MOINS30 :
                //interdit
                break;
            case ENTRE30_40 :
                setState(StatePrix.MOINS30);
                afficherBouquetsMoins30();
                break;
            case ENTRE40_50 :
                setState(StatePrix.MOINS30);
                afficherBouquetsMoins30();
                break;
            case PLUS50 :
                setState(StatePrix.MOINS30);
                afficherBouquetsMoins30();
                break;
        }
    }
    
    public void onMouseClick40_50 () {
        switch (myState) {
            case POPULAIRE:
                setState(StatePrix.ENTRE40_50);
                afficherBouquets40_50();
                break;
            case MOINS30 :
                setState(StatePrix.ENTRE40_50);
                afficherBouquets40_50();
                break;
            case ENTRE30_40 :
                setState(StatePrix.ENTRE40_50);
                afficherBouquets40_50();
                break;
            case ENTRE40_50 :
                //interdit
                break;
            case PLUS50 :
                setState(StatePrix.ENTRE40_50);
                afficherBouquets40_50();
                break;
        }
    }
    
    public void onMouseClick30_40 () {
        switch (myState) {
            case POPULAIRE:
                setState(StatePrix.ENTRE30_40);
                afficherBouquets30_40();
                break;
            case MOINS30 :
                setState(StatePrix.ENTRE30_40);
                afficherBouquets30_40();
                break;
            case ENTRE30_40 :
                //interdit
                break;
            case ENTRE40_50 :
                setState(StatePrix.ENTRE30_40);
                afficherBouquets30_40();
                break;
            case PLUS50 :
                setState(StatePrix.ENTRE30_40);
                afficherBouquets30_40();
                break;
        }
    }
    
    public void onMouseClickPlus50 () {
        switch (myState) {
            case POPULAIRE:
                setState(StatePrix.PLUS50);
                afficherBouquetsPlus50();
                break;
            case MOINS30 :
                setState(StatePrix.PLUS50);
                afficherBouquetsPlus50();
                break;
            case ENTRE30_40 :
                setState(StatePrix.PLUS50);
                afficherBouquetsPlus50();
                break;
            case ENTRE40_50 :
                setState(StatePrix.PLUS50);
                afficherBouquetsPlus50();
                break;
            case PLUS50 :
                //interdit
                break;
        }
    }
    
    public void afficherBouquetsMoins30 () {    
        ArrayList temp = new ArrayList<>();
        for (ArticlePanel article : liste) {
            if (article.getArticle().getPrix() <= 30) {
                temp.add(article);
            }
        }        
        liste.removeAll(liste);
        liste.addAll(temp);
    }
    
    public void afficherBouquets30_40 () {
        ArrayList temp = new ArrayList<>();
        for (ArticlePanel article : liste) {
            if (article.getArticle().getPrix() > 30 && article.getArticle().getPrix() <= 40) {
                temp.add(article);
            }
        }        
        liste.removeAll(liste);
        liste.addAll(temp);
    }
    
    public void afficherBouquets40_50 () {
        ArrayList temp = new ArrayList<>();
        for (ArticlePanel article : liste) {
            if (article.getArticle().getPrix() > 40 && article.getArticle().getPrix() <= 50) {
                temp.add(article);
            }
        }        
        liste.removeAll(liste);
        liste.addAll(temp);
    }
    
    public void afficherBouquetsPlus50 () {
        ArrayList temp = new ArrayList<>();
        for (ArticlePanel article : liste) {
            if (article.getArticle().getPrix() > 50) {
                temp.add(article);
            }
        }        
        liste.removeAll(liste);
        liste.addAll(temp);
    }
}
