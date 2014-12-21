/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landinggear.Model;

import java.util.*;

import landinggear.Controller.LandingSetControl;

/**
 *
 * @author larryndanga
 */
public class LandingSet extends Observable implements Observer {

    /* Protocole définissant les différentes type de landingSet:
     * Avant: 0
     * Gauche ou Droit: 1 
     */
    private int type;
    private Door d;
    private Gear g;

    public LandingSet(int type, Door d, Gear g) {
        this.type = type;
        this.d = d;
        this.g = g;
        switch (this.type = 0) {
            case 0:
                this.d.setOpen_door_time(1200);
                this.d.setClose_door_time(1200);
                this.g.setExtend_gear_time(1200);
                this.g.setRetract_gear_time(1600);
                break;
            case 1:
                this.d.setOpen_door_time(1500);
                this.d.setClose_door_time(1600);
                this.g.setExtend_gear_time(1600);
                this.g.setRetract_gear_time(2000);
                break;
            default:
                System.out.println("Erreur de type de LandingSet");
                break;
        }
    }

    public void extend() {

        this.d.openDoor();
        this.setChanged();
        this.notifyObservers();

        this.g.extendGear();
        this.setChanged();
        this.notifyObservers();

        this.d.closeDoor();
        this.setChanged();
        this.notifyObservers();
    }

    public void retract() {;

        this.d.openDoor();
        this.setChanged();
        this.notifyObservers();

        this.g.retractGear();
        this.setChanged();
        this.notifyObservers();

        this.d.closeDoor();
        this.setChanged();
        this.notifyObservers();

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Door getD() {
        return d;
    }

    public void setD(Door d) {
        this.d = d;
    }

    public Gear getG() {
        return g;
    }

    public void setG(Gear g) {
        this.g = g;
    }

    public void update(Observable o, Object arg) {

        if (o instanceof LandingSetControl) {
            LandingSetControl lSC = (LandingSetControl) o;
            if (lSC.getCommand() == "Down") {
                extend();
                this.setChanged();
                this.notifyObservers();
            }

            if (lSC.getCommand() == "Up") {

                retract();
                this.setChanged();
                this.notifyObservers();

            }

        } else if (o instanceof Door) {
            int dp = this.getD().getPosition();
            int gp = this.getG().getPosition();

            if (dp == 0 && gp == 0) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 1 && gp == 0) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 1 && gp == 1) {
                this.setChanged();
                this.notifyObservers();

            } else if (dp == 2 && gp == 1) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 2 && gp == 2) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 1 && gp == 2) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 0 && gp == 2) {
                this.setChanged();
                this.notifyObservers();
            }
        } else if (o instanceof Gear) {
            int dp = this.getD().getPosition();
            int gp = this.getG().getPosition();

            if (dp == 0 && gp == 0) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 1 && gp == 0) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 1 && gp == 1) {
                this.setChanged();
                this.notifyObservers();

            } else if (dp == 2 && gp == 1) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 2 && gp == 2) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 1 && gp == 2) {
                this.setChanged();
                this.notifyObservers();
            } else if (dp == 0 && gp == 2) {
                this.setChanged();
                this.notifyObservers();
            }
        } else {
            System.out.println("La commande saisie est incorrecte");
        }

    }

}
