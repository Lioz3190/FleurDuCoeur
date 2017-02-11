package fleurducoeur;


import fleurducoeur.StateTaille;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lioz-MBPR
 */
public class StateMachineTaille {
    
    private StateTaille myState;
    
    public StateMachineTaille () {
     
        myState = StateTaille.PETIT;
    }
    
    public void setState(StateTaille state){
        myState = state;
    }
    
    public StateTaille getState () {
        return myState;
    }
    
    public void onMouseClickPetit () {
        switch (getState()) {
            case POPULAIRE :
                setState(StateTaille.PETIT);
                afficherBouquetsPetits();
                break;                
            case PETIT :
                //Interdit
                break;
            case MOYEN :
                setState(StateTaille.PETIT);
                afficherBouquetsPetits();
                break;
            case GRAND :
                setState(StateTaille.PETIT);
                afficherBouquetsPetits();
                break;
        } 
    }
    
    public void onMouseClickMoyen () {
        switch (getState()) {
            case POPULAIRE :
                setState(StateTaille.MOYEN);
                afficherBouquetsMoyens();
                break;              
            case PETIT :
                setState(StateTaille.MOYEN);
                afficherBouquetsMoyens();
                break;
            case MOYEN :
                //Interdit
                break;
            case GRAND :
                setState(StateTaille.MOYEN);
                afficherBouquetsMoyens();
                break;
        } 
    }
    
    public void onMouseClickGrand () {
        switch (getState()) {
            case POPULAIRE :
                setState(StateTaille.GRAND);
                afficherBouquetsGrands();
                break;              
            case PETIT :
                setState(StateTaille.GRAND);
                afficherBouquetsGrands();
                break;
            case MOYEN :
                setState(StateTaille.GRAND);
                afficherBouquetsGrands();
                break;
            case GRAND :
                //Interdit
                break;
        } 
    }
    
    
    public void afficherBouquetsPetits () {
        
    }
    public void afficherBouquetsMoyens () {
        
    }
    public void afficherBouquetsGrands () {
        
    }
}
