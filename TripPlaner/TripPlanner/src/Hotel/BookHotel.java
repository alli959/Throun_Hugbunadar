/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import Trip.BookTrip;

/**
 *
 * @author alexa
 */
public class BookHotel extends javax.swing.JFrame {

    
    private String country;
    
    private boolean isTrip;
    /**
     * Creates new form BookHotel
     */
    public BookHotel(boolean isTrip, String country) {
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

        HotelOne = new javax.swing.JButton();
        HotelTwo = new javax.swing.JButton();
        HotelThree = new javax.swing.JButton();
        HotelFour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HotelOne.setText("Hotel 1");
        HotelOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotelOneActionPerformed(evt);
            }
        });

        HotelTwo.setText("Hotel 2");
        HotelTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotelTwoActionPerformed(evt);
            }
        });

        HotelThree.setText("Hotel 3");
        HotelThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotelThreeActionPerformed(evt);
            }
        });

        HotelFour.setText("Hotel 4");
        HotelFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotelFourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HotelFour, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addComponent(HotelThree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HotelTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HotelOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(HotelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HotelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HotelThree, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HotelFour, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HotelOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotelOneActionPerformed
        String x = String.valueOf(HotelOne.getText());
        if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
            a.setVisible(true);
        }
        
    }//GEN-LAST:event_HotelOneActionPerformed

    private void HotelTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotelTwoActionPerformed
        String x = String.valueOf(HotelOne.getText());
        if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
            a.setVisible(true);
        }
        
    }//GEN-LAST:event_HotelTwoActionPerformed

    private void HotelThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotelThreeActionPerformed
        String x = String.valueOf(HotelOne.getText());
        if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
            a.setVisible(true);
        }
        
    }//GEN-LAST:event_HotelThreeActionPerformed

    private void HotelFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotelFourActionPerformed
        String x = String.valueOf(HotelOne.getText());
        if(isTrip){
            this.setVisible(false);
            BookTrip a = new BookTrip(country);
            a.setVisible(true);
        }
        
    }//GEN-LAST:event_HotelFourActionPerformed

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
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookHotel(true, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HotelFour;
    private javax.swing.JButton HotelOne;
    private javax.swing.JButton HotelThree;
    private javax.swing.JButton HotelTwo;
    // End of variables declaration//GEN-END:variables
}