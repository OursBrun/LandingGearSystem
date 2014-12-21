/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package landinggear.Controller;

import java.util.Observable;
import java.util.Observer;
import landinggear.Model.Door;
import landinggear.Model.Gear;
import landinggear.Model.LandingSet;
import landinggear.Model.Sensors;

/**
 *
 * @author larryndanga
 */
public class LandingSetControl extends Observable implements Observer {
    
    
     private int type;
     private String command;
     private Door D;
     private Gear G;
     private LandingSet L;
     private Sensors S;
     
        
    public LandingSetControl(int type,String command) {
       this.type = type;
       this.command = command;
       this.D=new Door(0);
       this.G=new Gear(0);
       this.L =new LandingSet(type,D,G);
       this.addObserver(L);
       this.S =new Sensors(L);
       this.L.addObserver(S);
       
    }

    @Override
    public void update(Observable o, Object arg) {
     
    }
   
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        this.setChanged();
        this.notifyObservers();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
        this.setChanged();
        this.notifyObservers();
    }    

    public Door getD() {
        return D;
    }

    public void setD(Door D) {
        this.D = D;
    }

    public Gear getG() {
        return G;
    }

    public void setG(Gear G) {
        this.G = G;
    }

    public LandingSet getL() {
        return L;
    }

    public void setL(LandingSet L) {
        this.L = L;
    }

    public Sensors getS() {
        return S;
    }

    public void setS(Sensors S) {
        this.S = S;
    }
    
}
