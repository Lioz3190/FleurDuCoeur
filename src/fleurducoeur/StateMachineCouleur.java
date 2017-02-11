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
public class StateMachineCouleur {
    private StateCouleur myState;
    
    public StateMachineCouleur () {
        myState = StateCouleur.POPULAIRE;
    }
    
    public void setState (StateCouleur state) {
        myState = state;
    }
    
    public void onMouseClickRose () {
        switch (myState) {
            case POPULAIRE :
                setState(StateCouleur.ROSE);
                afficherBouquetsRoses();
                break;
            case ROUGE :
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
    
    public void afficherBouquetsRoses () {
        
    }
    
    public void afficherBouquetsRouges () {
        
    }
    
    public void afficherBouquetsBlanches () {
        
    }
    
    public void afficherBouquetsViolets () {
        
    }
    
    public void afficherBouquetsVaries () {
        
    }
}
