/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landinggear.Model;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author larryndanga
 */
public class TrafficLight{

    private String color;
    private String landingSetState;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLandingSetState() {
        return landingSetState;
    }

    public void setLandingSetState(String landingSetState) {
        this.landingSetState = landingSetState;
    }


    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
