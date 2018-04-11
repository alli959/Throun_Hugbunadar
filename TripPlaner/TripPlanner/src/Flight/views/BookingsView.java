/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight.views;


import controllers.Bookings;
import datastructures.Booking;
import datastructures.Flight;
import datastructures.Seat;
import datastructures.User;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import Flight.views.components.SeatButton;

/**
 *
 * @author greta
 */
public final class BookingsView extends javax.swing.JPanel {
    private final Main parent;          //Parent JFrame
    private final Flight flight;        //Flight to get info from
    private final SimpleDateFormat df;  //Date formatter
    private final SimpleDateFormat tf;  //Time formatter
    private final ArrayList<Seat> selectedSeats;

    /**
     * Creates new form FlightInfoView
     * @param main
     * @param flight
     */
    public BookingsView(Main main, Flight flight) {
        initComponents();
        this.parent = main;
        this.flight = flight;
        this.flight.orderSeats();
        this.df = new SimpleDateFormat("dd. MMM yyyy");
        this.tf = new SimpleDateFormat("HH:mm:ss");
        this.selectedSeats = new ArrayList<>();
        this.Nyskraning = Nyskraning;
        this.Innskraning = Innskraning;
        Nyskraning.setVisible(false);
        Innskraning.setVisible(false);
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
        renderSeats();
    }
            
    
    /**
     * Renders seats into the jSeatContainer panel
     */
    public void renderSeats() {
        ArrayList<Seat> seats = this.flight.getSeats();
        int rows = 5;
        int columns = seats.size() / 4;
        jSeatContainer.setLayout(new GridLayout(rows, columns));
        
        for(int i = 0; i < rows; i++) {
            if ( i == 2) {
                for(int j = 0; j < columns; j++) {
                    jSeatContainer.add(new JPanel());
                }
            } else if (i > 2) {
                for(int j = 0; j < columns; j++) {
                    SeatButton button = new SeatButton(seats.get((i - 1) + j*4));
                    attachClickedHandlerToSeat(button);
                    jSeatContainer.add(button);
                }
            }else {
                for(int j = 0; j < columns; j++) {
                    SeatButton button = new SeatButton(seats.get(i + j*4));
                    attachClickedHandlerToSeat(button);
                    jSeatContainer.add(button);
                }
            }
        }
    }
    
    private void attachClickedHandlerToSeat(SeatButton seat) {
        seat.addActionListener((ActionEvent e) -> {
            seat.setSelected();
            if (seat.isSelected()) selectedSeats.add(seat.getSeat());
            else selectedSeats.remove(seat.getSeat());
            calculatePrice();
        });
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
        jBookSeats = new javax.swing.JButton();
        jSeatContainer = new javax.swing.JPanel();
        jPrice = new javax.swing.JLabel();
        jErrorMessage = new javax.swing.JLabel();
        Nyskraning = new javax.swing.JButton();
        Innskraning = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jBackToSearchView.setBackground(new java.awt.Color(204, 204, 255));
        jBackToSearchView.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jBackToSearchView.setText("<-");
        jBackToSearchView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToFlightInfoView(evt);
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
        jHeader.setText("Bóka sæti");

        jOriginAndDestination.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jBookSeats.setBackground(new java.awt.Color(204, 204, 255));
        jBookSeats.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jBookSeats.setText("Bóka");
        jBookSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSeats(evt);
            }
        });

        jSeatContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeatContainer.setLayout(new java.awt.GridLayout(1, 0));

        jPrice.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPrice.setText("0 kr.");

        jErrorMessage.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        Nyskraning.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        Nyskraning.setText("Nýskráning");
        Nyskraning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NyskraningActionPerformed(evt);
            }
        });

        Innskraning.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        Innskraning.setText("Innskráning");
        Innskraning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InnskraningActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(455, 455, 455)
                                .addComponent(jBookSeats))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jErrorMessage)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Nyskraning)
                                        .addGap(90, 90, 90)
                                        .addComponent(Innskraning)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeatContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBackToSearchView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFlightDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFlightArrivalTimeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFlightArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFlightTimeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFlightTime, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jOriginAndDestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBackToSearchView, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFlightDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFlightDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBookSeats)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFlightTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFlightTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFlightArrivalTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFlightArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(jSeatContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jOriginAndDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jErrorMessage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nyskraning)
                            .addComponent(Innskraning))
                        .addGap(19, 19, 19))))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Sets the view back to FlightInfoView
     * @param evt 
     */
    private void goToFlightInfoView(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToFlightInfoView
        parent.loadFlightInfoView(null);
    }//GEN-LAST:event_goToFlightInfoView

    
    
    private void bookSeats(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSeats
        User loggedUser = parent.getLoggedInUser();
        if(loggedUser == null) {
            jErrorMessage.setText("Þú verður að skrá þig inn til að bóka");
            Nyskraning.setVisible(true);
            Innskraning.setVisible(true);
            return;
        }
  
        if (selectedSeats.size() < 1) {
            jErrorMessage.setText("Vinsamlegast veldu sæti til að bóka");
            return;
        }
        
        Bookings bookings = new Bookings();
        selectedSeats.forEach((s) -> {
            bookings.addBooking(new Booking(loggedUser.getSsn(), s));
        });
        
        if (bookings.bookSeats() == 0){
            selectedSeats.forEach((s) -> {
                s.setBooked();
            });
        }
    
        parent.setMyBookings(bookings);
        parent.loadFlightInfoView(this.flight);
    }//GEN-LAST:event_bookSeats

    private void NyskraningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NyskraningActionPerformed
        parent.loadLoginView("Nýskráning");
    }//GEN-LAST:event_NyskraningActionPerformed

    private void InnskraningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InnskraningActionPerformed
        parent.loadLoginView("Innskráning");
    }//GEN-LAST:event_InnskraningActionPerformed

    
    /**
     * Calculates price of selected seats;
     */
    private void calculatePrice() {
        DecimalFormat cf = new DecimalFormat("###,###,###");
        int price = this.flight.getPrice() * this.selectedSeats.size();
        jPrice.setText(String.format("%s kr.", cf.format(price)));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Innskraning;
    private javax.swing.JButton Nyskraning;
    private javax.swing.JButton jBackToSearchView;
    private javax.swing.JButton jBookSeats;
    private javax.swing.JLabel jErrorMessage;
    private javax.swing.JLabel jFlightArrivalTime;
    private javax.swing.JLabel jFlightArrivalTimeLabel;
    private javax.swing.JLabel jFlightDate;
    private javax.swing.JLabel jFlightDateLabel;
    private javax.swing.JLabel jFlightTime;
    private javax.swing.JLabel jFlightTimeLabel;
    private javax.swing.JLabel jHeader;
    private javax.swing.JLabel jOriginAndDestination;
    private javax.swing.JLabel jPrice;
    private javax.swing.JPanel jSeatContainer;
    // End of variables declaration//GEN-END:variables
}
