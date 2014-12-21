/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landinggear.View;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import landinggear.Model.*;

/**
 *
 * @author larryndanga
 */
public class LandingSetGUI extends javax.swing.JPanel implements Observer {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form LandingSetUI
     */
    public LandingSetGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Orange = new javax.swing.JPanel();
        Red = new javax.swing.JPanel();
        WheelsState = new javax.swing.JLabel();
        DoorState = new javax.swing.JLabel();
        Green = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LandingSetName = new javax.swing.JLabel();

        Orange.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout OrangeLayout = new javax.swing.GroupLayout(Orange);
        Orange.setLayout(OrangeLayout);
        OrangeLayout.setHorizontalGroup(
            OrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );
        OrangeLayout.setVerticalGroup(
            OrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        Red.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout RedLayout = new javax.swing.GroupLayout(Red);
        Red.setLayout(RedLayout);
        RedLayout.setHorizontalGroup(
            RedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );
        RedLayout.setVerticalGroup(
            RedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        WheelsState.setText("WheelState");

        DoorState.setText("DoorState");

        Green.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout GreenLayout = new javax.swing.GroupLayout(Green);
        Green.setLayout(GreenLayout);
        GreenLayout.setHorizontalGroup(
            GreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        GreenLayout.setVerticalGroup(
            GreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jLabel3.setText("Commentaire");

        LandingSetName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Orange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(WheelsState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DoorState, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LandingSetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(LandingSetName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Orange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(WheelsState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DoorState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoorState;
    private javax.swing.JPanel Green;
    private javax.swing.JLabel LandingSetName;
    private javax.swing.JPanel Orange;
    private javax.swing.JPanel Red;
    private javax.swing.JLabel WheelsState;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Sensors) {
            Sensors S = (Sensors) o;

            int dp = S.getLs().getD().getPosition();
            int gp = S.getLs().getG().getPosition();
            if (dp == 0 && gp == 0) {
                this.DoorState.setText("La Porte est fermée");
                this.WheelsState.setText("La roue est remontée");
                this.Orange.setBackground(Color.WHITE);
                this.Red.setBackground(Color.WHITE);
                this.Green.setBackground(Color.WHITE);
                System.out.println("la porte est fermée, la roue est remontée");
            }
            if (dp == 1 && gp == 0) {
                this.DoorState.setText("La Porte est en mouvement");
                this.WheelsState.setText("La roue est remontée");
                this.Orange.setBackground(Color.WHITE);
                this.Red.setBackground(Color.WHITE);
                this.Green.setBackground(Color.WHITE);
            }

            if (dp == 1 && gp == 1) {
                this.DoorState.setText("La Porte est en mouvement");
                this.WheelsState.setText("La roue est en mouvement");
                this.Orange.setBackground(Color.ORANGE);
                this.Red.setBackground(Color.WHITE);
                this.Green.setBackground(Color.WHITE);
            }
            if (dp == 2 && gp == 1) {
                this.DoorState.setText("La Porte est ouverte");
                this.WheelsState.setText("La roue est en mouvement");
                this.Orange.setBackground(Color.ORANGE);
                this.Red.setBackground(Color.WHITE);
                this.Green.setBackground(Color.WHITE);
            }
            if (dp == 2 && gp == 2) {
                this.DoorState.setText("La Porte est ouverte");
                this.WheelsState.setText("La roue est compètement sortie");
                this.Orange.setBackground(Color.WHITE);
                this.Red.setBackground(Color.WHITE);
                this.Green.setBackground(Color.GREEN);

            }
            if (dp == 1 && gp == 2) {
                this.DoorState.setText("La Porte est en mouvement");
                this.WheelsState.setText("La roue est complètement sortie");
                this.Orange.setBackground(Color.WHITE);
                this.Red.setBackground(Color.WHITE);
                this.Green.setBackground(Color.GREEN);
            }
            if (dp == 0 && gp == 2) {
                this.DoorState.setText("La Porte est fermée");
                this.WheelsState.setText("La roue est complètement sortie");
                this.Orange.setBackground(Color.WHITE);
                this.Red.setBackground(Color.WHITE);
                this.Green.setBackground(Color.GREEN);
     
            }

        }
    }
}
