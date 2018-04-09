/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;

import Hotel.BookHotel;
import Trip.BookTrip;

/**
 *
 * @author alexa
 */
public class BookFlight extends javax.swing.JFrame {
    
    private String country;
    
    private boolean isHotel;
    
    private boolean isTrip;
    
    private String flight;
    /**
     * Creates new form BookFlight
     */
    public BookFlight(boolean isHotel, boolean isTrip, String country) {
        this.isHotel = isHotel;
        this.country = country;
        this.isTrip = isTrip;
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FlightOne = new javax.swing.JButton();
        FlightThree = new javax.swing.JButton();
        FlightTwo = new javax.swing.JButton();
        FlightFour = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FlightOne.setText("Flight1");
        FlightOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightOneActionPerformed(evt);
            }
        });

        FlightThree.setText("Flight3");
        FlightThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightThreeActionPerformed(evt);
            }
        });

        FlightTwo.setText("Flight2");
        FlightTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightTwoActionPerformed(evt);
            }
        });

        FlightFour.setText("Flight4");
        FlightFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightFourActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Flight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FlightFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FlightTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addComponent(FlightOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FlightThree, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FlightOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FlightTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FlightThree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FlightFour, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FlightOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightOneActionPerformed
        String x = String.valueOf(FlightOne.getText());
        if(isHotel){
            this.setVisible(false);
            BookHotel a = new BookHotel(isTrip, country);
            a.setVisible(true);
        }
        else if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
        }
    }//GEN-LAST:event_FlightOneActionPerformed

    private void FlightTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightTwoActionPerformed
        String x = String.valueOf(FlightOne.getText());
        if(isHotel){
            this.setVisible(false);
            BookHotel a = new BookHotel(isTrip, country);
            a.setVisible(true);
        }
        else if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
        }
    }//GEN-LAST:event_FlightTwoActionPerformed

    private void FlightThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightThreeActionPerformed
        String x = String.valueOf(FlightOne.getText());
        if(isHotel){
            this.setVisible(false);
            BookHotel a = new BookHotel(isTrip, country);
            a.setVisible(true);
        }
        else if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
        }
    }//GEN-LAST:event_FlightThreeActionPerformed

    private void FlightFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightFourActionPerformed
        String x = String.valueOf(FlightOne.getText());
        if(isHotel){
            this.setVisible(false);
            BookHotel a = new BookHotel(isTrip, country);
            a.setVisible(true);
        }
        else if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
        }
    }//GEN-LAST:event_FlightFourActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFlight(true, true, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FlightFour;
    private javax.swing.JButton FlightOne;
    private javax.swing.JButton FlightThree;
    private javax.swing.JButton FlightTwo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}