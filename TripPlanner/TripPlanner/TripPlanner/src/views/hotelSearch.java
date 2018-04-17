/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.Flights;
import hotelAPI.Hotel;
import hotelAPI.HotelAPI;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import utils.Utilities;

/**
 *
 * @author alg35
 */
public class hotelSearch extends javax.swing.JPanel {
    
    private final Main parent;
    private JTable currentTable;
    private HotelAPI hotel;
    
    
    /**
     * Creates new form hotelSearch
     */
    public hotelSearch(Main main) {
        this.parent = main;
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

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTableContainer = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(603, 632));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setText("Staðsetning:");

        jCheckBox1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jCheckBox1.setText("Reykjavík");

        jCheckBox2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jCheckBox2.setText("Keflavík");

        jCheckBox3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jCheckBox3.setText("Egilsstaðir");

        jCheckBox4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jCheckBox4.setText("Akureyri");

        jTableContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jTableContainerLayout = new javax.swing.GroupLayout(jTableContainer);
        jTableContainer.setLayout(jTableContainerLayout);
        jTableContainerLayout.setHorizontalGroup(
            jTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jTableContainerLayout.setVerticalGroup(
            jTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        search.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        search.setText("Leita");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jCheckBox5.setText("Ísafjörður");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTableContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox2)))))
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox1))
                .addGap(19, 19, 19)
                .addComponent(search)
                .addGap(31, 31, 31)
                .addComponent(jTableContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            renderTable();
        } catch (SQLException ex) {
            Logger.getLogger(hotelSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    
    private void renderTable() throws SQLException {
    ArrayList<Hotel> hotels = hotel.getAllHotels();
    currentTable = Utilities.tableFromHotels(hotel);
    jTableContainer.add(currentTable.getTableHeader(), BorderLayout.NORTH);
    for(Hotel h : hotels){
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jTableContainer;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}