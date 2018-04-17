/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Trip.TourController;
import controllers.Flights;
import datastructures.Flight;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import utils.Utilities;

/**
 *
 * @author greta
 */
class SearchView extends javax.swing.JPanel {
    private final Main parent;                      //Parent holding all views.
    private JTable currentTable;                //Current table holding searched flights
    private Flights currentFlights;             //Current list of flights in table
    private boolean flightsDateOrderAsc = true; //Current date order of flights.
    private final SimpleDateFormat df;                //Object to format and read dates.
    private int selectedRow = -1;               //Currently selected row in table
    private TourController tour;
    
    /**
     * Creates new form SearchView
     */
    SearchView(Main main) {
        initComponents();
        this.parent = main;
        if(parent.getIsFlight()){
            resetButtonColors();
            flightTab.setBackground(Color.GREEN);
        }
        else if(parent.getIsHotel()){
            resetButtonColors();
            hotelTab.setBackground(Color.GREEN);
        }
        else{
            resetButtonColors();
            tripTab.setBackground(Color.GREEN);
        }
        currentTable = null;
        df = new SimpleDateFormat("dd/MM/yyyy");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jTableContainerScroll = new javax.swing.JScrollPane();
        jTableContainer = new javax.swing.JPanel();
        flightTab = new javax.swing.JButton();
        hotelTab = new javax.swing.JButton();
        tripTab = new javax.swing.JButton();
        jDateLabel2 = new javax.swing.JLabel();
        jDateField2 = new javax.swing.JFormattedTextField();
        jSubmitSearch = new javax.swing.JButton();
        jOriginLabel = new javax.swing.JLabel();
        jDestinationLabel = new javax.swing.JLabel();
        jOriginTextField = new javax.swing.JTextField();
        jDestinationTextField = new javax.swing.JTextField();
        jDateLabel1 = new javax.swing.JLabel();
        jDateField1 = new javax.swing.JFormattedTextField();

        jScrollPane1.setViewportView(jEditorPane1);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setBackground(new java.awt.Color(255, 255, 255));

        jTableContainerScroll.setBackground(new java.awt.Color(255, 255, 255));
        jTableContainerScroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableContainerScroll.setMaximumSize(new java.awt.Dimension(780, 400));
        jTableContainerScroll.setMinimumSize(new java.awt.Dimension(780, 400));

        jTableContainer.setBackground(new java.awt.Color(255, 255, 255));
        jTableContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableContainer.setAutoscrolls(true);
        jTableContainer.setLayout(new java.awt.BorderLayout());
        jTableContainerScroll.setViewportView(jTableContainer);

        flightTab.setText("Flug");
        flightTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightTabActionPerformed(evt);
            }
        });

        hotelTab.setText("Hótel");
        hotelTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelTabActionPerformed(evt);
            }
        });

        tripTab.setText("Dagsferð");
        tripTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripTabActionPerformed(evt);
            }
        });

        jDateLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jDateLabel2.setText("Til:");

        jDateField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jDateField2.setText("31/12/2018");
        jDateField2.setToolTipText("dd/MM/yyyy");

        jSubmitSearch.setBackground(new java.awt.Color(204, 204, 255));
        jSubmitSearch.setFont(new java.awt.Font("Courier New", 1, 11)); // NOI18N
        jSubmitSearch.setText("Leita");
        jSubmitSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search(evt);
            }
        });

        jOriginLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jOriginLabel.setText("Brottfararstaður:");

        jDestinationLabel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jDestinationLabel.setText("Áfangastaður:");

        jDateLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jDateLabel1.setText("Frá:");

        jDateField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jDateField1.setText("01/01/2018");
        jDateField1.setToolTipText("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTableContainerScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flightTab, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hotelTab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tripTab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jOriginLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jOriginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jDestinationLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDestinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSubmitSearch)
                            .addComponent(jDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightTab)
                    .addComponent(hotelTab)
                    .addComponent(tripTab))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOriginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOriginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDestinationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDestinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSubmitSearch)
                .addGap(54, 54, 54)
                .addComponent(jTableContainerScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void flightTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightTabActionPerformed
        resetButtonColors();
        flightTab.setBackground(Color.GREEN);
    }//GEN-LAST:event_flightTabActionPerformed

    private void hotelTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelTabActionPerformed
        resetButtonColors();
        hotelTab.setBackground(Color.GREEN);
    }//GEN-LAST:event_hotelTabActionPerformed

    private void tripTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripTabActionPerformed
        resetButtonColors();
        tripTab.setBackground(Color.GREEN);
    }//GEN-LAST:event_tripTabActionPerformed

    /**
     * Event handler for when a flight is searched.
     * @param evt 
     */
    private void search(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search
        try {
            System.out.println(tour.getToursByLocation("Reykjavík"));
        } catch (Exception ex) {
            Logger.getLogger(SearchView.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (!validateDate()) return;

            String origin = jOriginTextField.getText();
            String destination = jDestinationTextField.getText();
            Date d1 = df.parse(jDateField1.getText());
            Date d2 = df.parse(jDateField2.getText());

            Flights search = Flights.getFlightsToFromBetweenDates(origin, destination, d1, d2);
            if (search != null) {
                currentFlights = search;
                flightsDateOrderAsc = true;
                renderTable();
            }
        } catch (ParseException ex) {
            Logger.getLogger(SearchView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search

    
    
    
    private void resetButtonColors(){
        flightTab.setBackground(Color.RED);
        hotelTab.setBackground(Color.RED);
        tripTab.setBackground(Color.RED);
    }
    /**
     * Checks if date input matches the right format
     * @return 
     */
    private boolean validateDate() {
        boolean isOk = true;
        String dateFormat = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        if (!jDateField1.getText().matches(dateFormat)) {
            jDateField1.setBackground(new Color(1f, 0.f, 0.f, 0.2f));
            isOk = false;
        } else {
            jDateField1.setBackground(new Color(255, 255, 255));
        }
        
        if (!jDateField2.getText().matches(dateFormat)) {
            jDateField2.setBackground(new Color(1f, 0.f, 0.f, 0.2f));
            isOk = false;
        } else {
            jDateField2.setBackground(new Color(255, 255, 255));
        }
        
        return isOk;
    }
    
   
    /**
     * Loads flight view after selecting a flight in table.
     * @param flight 
     */
    private void goToFlightInfoView(Flight flight) {
        this.parent.loadFlightInfoView(flight);
    }
    
    /**
     * Renders table of flights onto jTableContainer
     */
    private void renderTable() {
        if (currentTable != null) {
            jTableContainer.remove(currentTable.getTableHeader());
            jTableContainer.remove(currentTable);
        }
        
        currentTable = Utilities.tableFromFlights(currentFlights);
        jTableContainer.add(currentTable.getTableHeader(), BorderLayout.NORTH);
        jTableContainer.add(currentTable, BorderLayout.CENTER);
        setHeaderEvents();
        setTableEvents();
        selectedRow = -1;
        this.revalidate();
    }
    
    /**
     * Attaches the sorting events to the table headers.
     */
    private void setHeaderEvents() {
        currentTable.getTableHeader().addMouseListener(new MouseAdapter() {
            /**
             * If a flights is selected twice in a row, calls to load
             * a new FlightInfoView holding the information about the
             * chosen flight.
             * @param e 
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                int col = currentTable.columnAtPoint(e.getPoint());
                switch(col) {
                    case 0:
                    case 1:
                        flightsDateOrderAsc = !flightsDateOrderAsc;
                        currentFlights.sortFlightsByDate(flightsDateOrderAsc);
                        break;
                    case 4:
                        currentFlights.sortByPrice();
                        renderTable();
                        break;
                }
            }
            
        });
    }
    
    /**
     * Attaches event handlers to JTable holding the list of flights
     * that was last searched.
     */
    private void setTableEvents() {
        currentTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickedRow = currentTable.getSelectedRow();
                if(selectedRow == clickedRow) {
                    if (clickedRow == -1) return;
                    goToFlightInfoView(currentFlights.getFlights().get(clickedRow));
                } else {
                    selectedRow = clickedRow;
                }
                super.mouseClicked(e);
                
            }
            
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton flightTab;
    private javax.swing.JButton hotelTab;
    private javax.swing.JFormattedTextField jDateField1;
    private javax.swing.JFormattedTextField jDateField2;
    private javax.swing.JLabel jDateLabel1;
    private javax.swing.JLabel jDateLabel2;
    private javax.swing.JLabel jDestinationLabel;
    private javax.swing.JTextField jDestinationTextField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel jOriginLabel;
    private javax.swing.JTextField jOriginTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSubmitSearch;
    private javax.swing.JPanel jTableContainer;
    private javax.swing.JScrollPane jTableContainerScroll;
    private javax.swing.JButton tripTab;
    // End of variables declaration//GEN-END:variables
}
