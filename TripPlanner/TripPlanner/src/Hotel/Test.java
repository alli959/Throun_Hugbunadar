/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;


import java.util.ArrayList;
import java.sql.*;
import hotelAPI.*;

/**
 *
 * @author alg35
 */
public class Test {
    
	public static void main(String[] args) throws SQLException {
		HotelAPI api = new HotelAPI();
		ArrayList<Hotel> hotels = api.getAllHotels();

		for(Hotel h : hotels) {
			System.out.println(h.name);
		}
	}

}
    