/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import hotelAPI.Hotel;
import hotelAPI.HotelAPI;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alg35
 */
public class HotelSearchTableModel extends AbstractTableModel {
    private final String[] columnNames;
    private HotelAPI Hotel;
    SimpleDateFormat df;
    SimpleDateFormat tf;
    DecimalFormat cf;
    
    public HotelSearchTableModel(HotelAPI hotel){
        this.columnNames = new String[]{"Name","City","Rating","Description"};
        this.Hotel = hotel;
        SimpleDateFormat df;
        SimpleDateFormat tf;
        SimpleDateFormat cf;
    }

    


    @Override
    public int getRowCount() {
        int returnValue = 0;
        try {
            ArrayList<Hotel> hotels = Hotel.getAllHotels();
            for(Hotel h: hotels){
                returnValue++;
        }
        } catch (SQLException ex) {
            Logger.getLogger(HotelSearchTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(returnValue);
        return returnValue;
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

   
}
