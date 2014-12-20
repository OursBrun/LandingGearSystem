/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package landinggear.Controller;

import java.util.Scanner;
import landinggear.Model.Command;
import landinggear.Model.Door;
import landinggear.Model.Gear;
import landinggear.Model.LandingSet;
import landinggear.Model.Sensors;
import landinggear.Model.TrafficLight;

/**
 *
 * @author larryndanga
 */
public class LandingGear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
       Command C = new Command();
        Door D=new Door(0);
        Gear G=new Gear(0);
        LandingSet L=new LandingSet(0,D,G);
        Sensors S=new Sensors(L);
        TrafficLight TL = new TrafficLight();
        C.addObserver(L);
        L.addObserver(S);
         while(true){  
       
        System.out.println("Quelle commande utilisez-vous ?   Tapez 0 pour  Up ou  1 pour Down");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        
        switch(choix){
            
            case 0:
                C.setType(0);
                break;
            case 1:
                C.setType(1);
                break;
        
        }
        
    }
    
    }
    
}
