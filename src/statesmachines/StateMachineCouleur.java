/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesmachines;

import fleurducoeur.ArticlePanel;
import pages.PageFleurs;
import java.util.ArrayList;

/**
 *
 * @author Lioz-MBPR
 */
public class StateMachineCouleur {
    private StateCouleur myState;
    
    private PageFleurs pageFleurs;
    
    public StateMachineCouleur (PageFleurs page) {
        myState = StateCouleur.POPULAIRE;
        pageFleurs = page;
    }
    
    public void setState (StateCouleur state) {
        myState = state;
    }
    
    public void onMouseClickRose () {
        System.out.println("mouse click rose");
        switch (myState) {
            case POPULAIRE :
                setState(StateCouleur.ROSE);
                afficherBouquetsRoses();
                break;
            case ROUGE :
                setState(StateCouleur.ROSE);
                afficherBouquetsRoses();
                break;
            case JAUNE :
                setState(StateCouleur.ROSE);
                afficherBouquetsRoses();
                break;
            case ROSE :
                //interdit
                break;
            case BLANCHE :
                setState(StateCouleur.ROSE);
                afficherBouquetsRoses();
                break;
            case VIOLET :
                setState(StateCouleur.ROSE);
                afficherBouquetsRoses();
                break;
            case VARIE :
                setState(StateCouleur.ROSE);
                afficherBouquetsRoses();
                break;
        }
    }
    
    public void onMouseClickRouge () {
        System.out.println("mouse click rouge");
        switch (myState) {
            case POPULAIRE :
                setState(StateCouleur.ROUGE);
                afficherBouquetsRouges();
                break;
            case ROUGE :
                //interdit
                break;
            case ROSE :
                setState(StateCouleur.ROUGE);
                afficherBouquetsRouges();
                break;
            case JAUNE :
                setState(StateCouleur.ROUGE);
                afficherBouquetsRouges();
                break;
            case BLANCHE :
                setState(StateCouleur.ROUGE);
                afficherBouquetsRouges();
                break;
            case VIOLET :
                setState(StateCouleur.ROUGE);
                afficherBouquetsRouges();
                break;
            case VARIE :
                setState(StateCouleur.ROUGE);
                afficherBouquetsRouges();
                break;
        }
    }
    
    public void onMouseClickBlanche () {
        switch (myState) {
            case POPULAIRE :
                setState(StateCouleur.BLANCHE);
                afficherBouquetsBlanches();
                break;
            case ROUGE :
                setState(StateCouleur.BLANCHE);
                afficherBouquetsBlanches();
                break;
            case ROSE :
                setState(StateCouleur.BLANCHE);
                afficherBouquetsBlanches();
                break;
            case JAUNE :
                setState(StateCouleur.BLANCHE);
                afficherBouquetsBlanches();
                break;
            case BLANCHE :
                //interdit
                break;
            case VIOLET :
                setState(StateCouleur.BLANCHE);
                afficherBouquetsBlanches();
                break;
            case VARIE :
                setState(StateCouleur.BLANCHE);
                afficherBouquetsBlanches();
                break;
        }
    }
    
    public void onMouseClickViolet () {
        switch (myState) {
            case POPULAIRE :
                setState(StateCouleur.VIOLET);
                afficherBouquetsViolets();
                break;
            case ROUGE :
                setState(StateCouleur.VIOLET);
                afficherBouquetsViolets();
                break;
            case ROSE :
                setState(StateCouleur.VIOLET);
                afficherBouquetsViolets();
                break;
            case JAUNE :
                setState(StateCouleur.VIOLET);
                afficherBouquetsViolets();
                break;
            case BLANCHE :
                setState(StateCouleur.VIOLET);
                afficherBouquetsViolets();
                break;
            case VIOLET :
                //interdit
                break;
            case VARIE :
                setState(StateCouleur.VIOLET);
                afficherBouquetsViolets();
                break;
        }
    }
    
    
    public void onMouseClickVarie () {
        switch (myState) {
            case POPULAIRE :
                setState(StateCouleur.VARIE);
                afficherBouquetsVaries();
                break;
            case ROUGE :
                setState(StateCouleur.VARIE);
                afficherBouquetsVaries();
                break;
            case ROSE :
                setState(StateCouleur.VARIE);
                afficherBouquetsVaries();
                break;
            case JAUNE :
                setState(StateCouleur.VARIE);
                afficherBouquetsVaries();
                break;
            case BLANCHE :
                setState(StateCouleur.VARIE);
                afficherBouquetsVaries();
                break;
            case VIOLET :
                setState(StateCouleur.VARIE);
                afficherBouquetsVaries();
                break;
            case VARIE :
                //interdit
                break;
        }
    }
    public void onMouseClickJaune () {
        switch (myState) {
            case POPULAIRE :
                setState(StateCouleur.JAUNE);
                afficherBouquetsJaunes();
                break;
            case ROUGE :
                setState(StateCouleur.JAUNE);
                afficherBouquetsJaunes();
                break;
            case ROSE :
                setState(StateCouleur.JAUNE);
                afficherBouquetsJaunes();
                break;
            case JAUNE :
                //interdit
                break;
            case BLANCHE :
                setState(StateCouleur.JAUNE);
                afficherBouquetsJaunes();
                break;
            case VIOLET :
                setState(StateCouleur.JAUNE);
                afficherBouquetsJaunes();
                break;
            case VARIE :
                setState(StateCouleur.JAUNE);
                afficherBouquetsJaunes();
                break;
        }
    }
    
    public void afficherBouquetsRoses () {
        for (ArticlePanel article : pageFleurs.getListeArticles()) {
            if (article.getArticle().getCouleur().equals("Rose")) {
                article.setVisibleColor(true);
            }
            else
            {
                article.setVisibleColor(false);
            }
        }        
    }
    
    public void afficherBouquetsRouges () {
        for (ArticlePanel article : pageFleurs.getListeArticles()) {
            if (article.getArticle().getCouleur().equals("Rouge")) {
                article.setVisibleColor(true);
            }
            else
            {
                article.setVisibleColor(false);
            }
        }  
    }
    
    public void afficherBouquetsJaunes () {
        for (ArticlePanel article : pageFleurs.getListeArticles()) {
            if (article.getArticle().getCouleur().equals("Jaune")) {
                article.setVisibleColor(true);
            }
            else
            {
                article.setVisibleColor(false);
            }
        }  
        
    }
    
    public void afficherBouquetsBlanches () {
        for (ArticlePanel article : pageFleurs.getListeArticles()) {
            if (article.getArticle().getCouleur().equals("Blanche")) {
                article.setVisibleColor(true);
            }
            else
            {
                article.setVisibleColor(false);
            }
        }  
        
    }
    
    public void afficherBouquetsViolets () {
        for (ArticlePanel article : pageFleurs.getListeArticles()) {
            if (article.getArticle().getCouleur().equals("Violet")) {
                article.setVisibleColor(true);
            }
            else
            {
                article.setVisibleColor(false);
            }
        }  
    }
    
    public void afficherBouquetsVaries () {
        for (ArticlePanel article : pageFleurs.getListeArticles()) {
            if (article.getArticle().getCouleur().equals("Varie")) {
                article.setVisibleColor(true);
            }
            else
            {
                article.setVisibleColor(false);
            }
        }  
        
    }
}
