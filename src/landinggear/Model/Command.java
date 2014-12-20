/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package landinggear.Model;

import java.util.Observable;

/**
 *
 * @author Admin
 */
public class Command extends Observable {
    
    
    /* Protocole définissant les différentes commandes:
     * Up: 0 
     * Down : 1
     */
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        this.setChanged();
        this.notifyObservers();
    }
    
}
