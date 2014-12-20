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
public class Door  {

    private int open_door_time;
    private int close_door_time;

    /* Protocole définissant les différentes positions de la porte:
     * Fermée: 0 
     * Semi-ouverte : 1 
     * Ouverte: 2 
     */
    private int position;

    public Door(int position) {
        this.position = position;
    }

    public void openDoor() {
        if(this.position == 0){
            long open = System.currentTimeMillis() + open_door_time;
            while (System.currentTimeMillis() < open) {
                this.position = 1;
            }
            this.position = 2;
        }
    }

    public void closeDoor() {
        if(this.position == 2)
        {
            long closing = System.currentTimeMillis() + close_door_time;
            while (System.currentTimeMillis() < closing) {
                this.position = 1;
            }
            this.position = 0;
        }
    }

    public int getOpen_door_time() {
        return open_door_time;
    }

    public void setOpen_door_time(int open_door_time) {
        this.open_door_time = open_door_time;
    }

    public int getClose_door_time() {
        return close_door_time;
    }

    public void setClose_door_time(int close_door_time) {
        this.close_door_time = close_door_time;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
