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
public class Sensors extends Observable implements Observer {

	private LandingSet ls;
        private Door d;
        private Gear g;
	public Sensors() {
            this.d= new Door(0);
            this.g=new Gear(0);
		this.ls = new LandingSet(0,d ,g );
	}

	public void update(Observable obs, Object obj) {
		if (obs instanceof LandingSet) {
                        this.ls = (LandingSet) obs;
			int dp = ls.getD().getPosition();
			int gp = ls.getG().getPosition();
                        
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
				this.notifyObservers();}

		/*	if (dp == 0 && gp == 0) {
				System.out.println("Position Door:" + ls.getD().getPosition());
				System.out.println("Position Gear:" + ls.getG().getPosition());
				System.out.println("la porte est fermée, la roue est remontée");
				this.setChanged();
				this.notifyObservers();
			} else if (dp == 1 && gp == 0) {
				System.out.println("Position Door:" + ls.getD().getPosition());
				System.out.println("Position Gear:" + ls.getG().getPosition());
				System.out
						.println("La porte est en mouvement, la roue est remontée");
				this.setChanged();
				this.notifyObservers();
			} else if (dp == 1 && gp == 1) {
				System.out.println("Position Door:" + ls.getD().getPosition());
				System.out.println("Position Gear:" + ls.getG().getPosition());
				System.out.println("La porte et la roue sont en mouvement");
				this.setChanged();
				this.notifyObservers();

			} else if (dp == 2 && gp == 1) {
				System.out.println("Position Door:" + ls.getD().getPosition());
				System.out.println("Position Gear:" + ls.getG().getPosition());
				System.out.println("La porte est ouverte, la roue est en mouvement");
				this.setChanged();
				this.notifyObservers();
			} else if (dp == 2 && gp == 2) {
				System.out.println("Position Door:" + ls.getD().getPosition());
				System.out.println("Position Gear:" + ls.getG().getPosition());
				System.out.println("La porte est ouverte, la roue est sortie");
				this.setChanged();
				this.notifyObservers();
			} else if (dp == 1 && gp == 2) {
				System.out.println("Position Door:" + ls.getD().getPosition());
				System.out.println("Position Gear:" + ls.getG().getPosition());
				System.out.println("La porte est en mouvement, la roue est sortie");
				this.setChanged();
				this.notifyObservers();
			} else if (dp == 0 && gp == 2) {
				System.out.println("Position Door:" + ls.getD().getPosition());
				System.out.println("Position Gear:" + ls.getG().getPosition());
				System.out.println("La porte est fermée, la roue est sortie");
				this.setChanged();
				this.notifyObservers();
			}*/
		}
	}

	public LandingSet getLs() {
		return ls;
	}

	public void setLs(LandingSet ls) {
		this.ls = ls;
	}
}
