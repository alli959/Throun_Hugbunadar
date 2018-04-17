package Trip;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserController {
    private DatabaseConnection DBconnection;

    public UserController() {

    }

    public void addUser(User user) throws Exception {
        DBconnection = new DatabaseConnection();
        if(user.getUserName().length() > 0) {
            try {
                String query = "INSERT INTO users (name, mail, phone) VALUES ('" + user.getUserName() + "', '" + user.getUserMail() + "', '" + user.getUserPhone() + "')";
                DBconnection.executeUpdate(query);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            throw new Exception("Username must be set");
        }
    }


    public void removeUser(User user) throws Exception {
        try {
            DBconnection = new DatabaseConnection();
            String query = "DELETE FROM users WHERE name='" + user.getUserName() + "'";
            DBconnection.executeUpdate(query);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public User getUser(String userName) throws Exception {
        DBconnection = new DatabaseConnection();
        String query = "SELECT * FROM users WHERE name='" + userName + "'";
        ArrayList<String> sel = null;
        try {
            sel = DBconnection.executeQuery(query);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        User resultUser = new User(Integer.parseInt(sel.get(0)), sel.get(2), sel.get(3) ,sel.get(1), null);
        return resultUser;
    }

    public void addBooking(Booking booking, User user) throws Exception {
        try {
            DBconnection = new DatabaseConnection();
            String query = "INSERT INTO bookings (tour, user) VALUES ('" + booking.getTour() + "', '" + user.getUserId() + "')";
            DBconnection.executeUpdate(query);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

/*eftir að setja í gagnagrunn og finna utut location, eftir að klára resultbooking

    public Booking getBooking(int bookingId) {
        DBconnection = new DatabaseConnection();
        String query = "SELECT * FROM bookings WHERE id='" + bookingId + "'";
        ArrayList<String> sel = null;
        try {
            sel = DBconnection.executeQuery(query);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
        Booking resultBooking = new Booking(Integer.parseInt(sel.get(0)), sel.get(2), sel.get(3) ,sel.get(1), null);
        return resultBooking;
    }
*/

    public void removeBooking(Booking booking) {
        try {
            DBconnection = new DatabaseConnection();
            String query = "DELETE FROM bookings WHERE user='" + booking.getName() + "' AND tour='" + booking.getTour() + "' ";
            DBconnection.executeUpdate(query);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
