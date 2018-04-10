/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight.views;

import datastructures.Flight;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author greta
 */
public class FlightInfoView extends javax.swing.JPanel {
    private final Main parent;          //Parent JFrame
    private final Flight flight;        //Flight to get info from
    private final SimpleDateFormat df;  //Date formatter
    private final SimpleDateFormat tf;  //Time formatter

    /**
     * Creates new form FlightInfoView
     * @param Main main
     * @param Flight flight
     */
    public FlightInfoView(Main main, Flight flight) {
        initComponents();
        this.parent = main;
        this.flight = flight;
        this.df = new SimpleDateFormat("dd. MMM yyyy");
        this.tf = new SimpleDateFormat("HH:mm:ss");
        loadInfo();
    }
    
    public void loadInfo() {
        //Fararstaður - Áfangastaður
        String inf = this.flight.getOrigin().getName() + " til " + 
                this.flight.getDestination().getName();
        jOriginAndDestination.setText(inf);
        //Tímasetningar
        jFlightDate.setText(this.df.format(this.flight.getDate()));
        jFlightTime.setText(this.tf.format(this.flight.getDate()));
        int flightLength = this.flight.getTraveltime()*60 * 1000;
        Date arrivalTime = new Date(this.flight.getDate().getTime() + flightLength);
        jFlightArrivalTime.setText(this.tf.format(arrivalTime));
        // Sæti
        jAvailableSeats.setText(String.valueOf(this.flight.availableSeats()));
        //Verð
        DecimalFormat cf = new DecimalFormat("###,###,### kr");
        jPrice.setText(cf.format(this.flight.getPrice()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackToSearchView = new javax.swing.JButton();
        jFlightTime = new javax.swing.JLabel();
        jFlightDate = new javax.swing.JLabel();
        jFlightTimeLabel = new javax.swing.JLabel();
        jFlightDateLabel = new javax.swing.JLabel();
        jFlightArrivalTimeLabel = new javax.swing.JLabel();
        jFlightArrivalTime = new javax.swing.JLabel();
        jHeader = new javax.swing.JLabel();
        jOriginAndDestination = new javax.swing.JLabel();
        jAvailableSeatsLabel = new javax.swing.JLabel();
        jAvailableSeats = new javax.swing.JLabel();
        jPriceLabel = new javax.swing.JLabel();
        jPrice = new javax.swing.JLabel();
        jBackToSearchView1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jBackToSearchView.setBackground(new java.awt.Color(204, 204, 255));
        jBackToSearchView.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jBackToSearchView.setText("<-");
        jBackToSearchView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToSearchView(evt);
            }
        });

        jFlightTime.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        jFlightDate.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        jFlightTimeLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jFlightTimeLabel.setText("Áætlaður farartími:");

        jFlightDateLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jFlightDateLabel.setText("Dags:");

        jFlightArrivalTimeLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jFlightArrivalTimeLabel.setText("Áætlaður komutími:");

        jFlightArrivalTime.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        jHeader.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jHeader.setText("Upplýsingar");

        jOriginAndDestination.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jAvailableSeatsLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jAvailableSeatsLabel.setText("Laus Sæti:");

        jAvailableSeats.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jPriceLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jPriceLabel.setText("Verð frá:");

        jPrice.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jBackToSearchView1.setBackground(new java.awt.Color(204, 204, 255));
        jBackToSearchView1.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jBackToSearchView1.setText("Bóka sæti");
        jBackToSearchView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToBookingsView(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jOriginAndDestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFlightDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFlightTimeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFlightTime, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBackToSearchView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jFlightArrivalTimeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFlightArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAvailableSeatsLabel)
                                    .addComponent(jPriceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jAvailableSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jBackToSearchView1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBackToSearchView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jOriginAndDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFlightDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFlightTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFlightTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFlightArrivalTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFlightArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jAvailableSeatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jAvailableSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBackToSearchView1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Sets the view back to SearchView
     * @param evt 
     */
    private void goToSearchView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToSearchView
        parent.loadSearchView();
    }//GEN-LAST:event_goToSearchView

    /**
     * Goes to to a BookingView handling bookings for flight
     * @param evt 
     */
    private void goToBookingsView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToBookingsView
        parent.loadBookingsView(this.flight);
    }//GEN-LAST:event_goToBookingsView


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAvailableSeats;
    private javax.swing.JLabel jAvailableSeatsLabel;
    private javax.swing.JButton jBackToSearchView;
    private javax.swing.JButton jBackToSearchView1;
    private javax.swing.JLabel jFlightArrivalTime;
    private javax.swing.JLabel jFlightArrivalTimeLabel;
    private javax.swing.JLabel jFlightDate;
    private javax.swing.JLabel jFlightDateLabel;
    private javax.swing.JLabel jFlightTime;
    private javax.swing.JLabel jFlightTimeLabel;
    private javax.swing.JLabel jHeader;
    private javax.swing.JLabel jOriginAndDestination;
    private javax.swing.JLabel jPrice;
    private javax.swing.JLabel jPriceLabel;
    // End of variables declaration//GEN-END:variables
}
