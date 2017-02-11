/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleurducoeur;

/**
 *
 * @author valentin
 */
public class MenuStateMachine {
    private enum State{
        ACCUEIL, FLEUR, BOUQUET, PATIENCE, CONTACT, PANIER;
    }
    
    private State state;
    
    public MenuStateMachine(){
        state = State.ACCUEIL;
    }
    
    public void accueil(){
        switch (state){
            case ACCUEIL :
                break;
            case FLEUR :
                break;
            case BOUQUET :
                break;
            case PATIENCE :
                break;
            case CONTACT :
                break;
            case PANIER : 
                break;
        }
    }
}
