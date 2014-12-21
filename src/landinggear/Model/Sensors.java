/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landinggear.Model;

import java.util.*;

/**
 *
 * @author larryndanga
 */
public class Sensors extends Observable implements Observer {

    //private TrafficLight tl;
    private LandingSet ls;

  

    public Sensors(LandingSet ls) {
        this.ls = ls;
    }

    public void update(Observable obs, Object obj) {
        if (obs instanceof LandingSet) {
            ls = (LandingSet) obs;
         int dp =ls.getD().getPosition();
         int gp = ls.getG().getPosition();
         
        if(dp==0 && gp==0){
            System.out.println("Position Door:" + ls.getD().getPosition());
            System.out.println("Position Gear:" + ls.getG().getPosition());   
            System.out.println("Le train d'attérissage est remonté");
            this.setChanged();
            this.notifyObservers();
        }
         else if (dp==0 && gp==2 ){
            System.out.println("Position Door:" + ls.getD().getPosition());
            System.out.println("Position Gear:" + ls.getG().getPosition());   
            System.out.println("Le train d'attérissage est sorti");
            this.setChanged();
            this.notifyObservers();
           
        
         }else {
             if (gp==1) {
            System.out.println("Position Door:" + ls.getD().getPosition());
            System.out.println("Position Gear:" + ls.getG().getPosition());   
            System.out.println("Le train d'attérissage est en mouvement");
            this.setChanged();
            this.notifyObservers();}
             else {
             } 
         }
        
    }

}
      public LandingSet getLs() {
        return ls;
    }

    public void setLs(LandingSet ls) {
        this.ls = ls;
    }
}
