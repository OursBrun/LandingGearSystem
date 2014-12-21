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
public class Gear extends Observable {

    private int extend_gear_time;
    private int retract_gear_time;

    /* Protocole définissant les différentes positions de la roue:
     * Rétractée: 0
     * Semi-étendue : 1
     * Etendue: 2 
     */
    private int position;
    
    public Gear(int position) {
        this.position = position;
    }
    public void retractGear() {
    	
        if(this.position == 2){
             long retract = System.currentTimeMillis() + retract_gear_time;
        while (System.currentTimeMillis() < retract) {
            this.position = 1;
            this.setChanged();
            this.notifyObservers();
        }
        this.position = 0;
        this.setChanged();
        this.notifyObservers();
        }
       
    }

    public void extendGear() {

        if(this.position == 0){
             long open = System.currentTimeMillis() + extend_gear_time;
        while (System.currentTimeMillis() < open) {
            this.position = 1;
            this.setChanged();
            this.notifyObservers();
        }
        this.position = 2;
        this.setChanged();
        this.notifyObservers();
        }
       
    }

    public int getExtend_gear_time() {
        return extend_gear_time;
    }

    public void setExtend_gear_time(int extend_gear_time) {
        this.extend_gear_time = extend_gear_time;
    }

    public int getRetract_gear_time() {
        return retract_gear_time;
    }

    public void setRetract_gear_time(int retract_gear_time) {
        this.retract_gear_time = retract_gear_time;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
