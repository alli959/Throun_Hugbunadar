package Trip;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TourController {
    private DatabaseConnection DBconnection;

    public TourController() {

    }

    public void addTour(Tour tour) throws Exception {
        DBconnection = new DatabaseConnection();
        if(tour.getTourName().length() > 0) {
            try {
                String query = "INSERT INTO tours (name, price, date, location, host, guide, category, maxPeople, info) VALUES ('" + tour.getTourName() +
                        "', '" + tour.getTourPrice() + "', '" + tour.getTourDate() + "', '" + tour.getTourLocation() + "', '" + tour.getTourHost() +
                        "', '" + tour.getTourGuide() + "', '" + tour.getTourCategory() + "', '" + tour.getTourMaxPeople() + "', '" + tour.getTourInfo() + "')";
                System.out.println(query);
                DBconnection.executeUpdate(query);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            throw new Exception("Tour name must be set");
        }

    }

    public void removeTour(Tour tour) throws Exception {
        try {
            DBconnection = new DatabaseConnection();
            String query = "DELETE FROM tours WHERE id=" + tour.getTourId();
            System.out.println(query);
            DBconnection.executeUpdate(query);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }

    public ArrayList<Tour> getAllTours() throws Exception {
        String query = "SELECT * FROM tours";
        System.out.println(query);
        ArrayList<String> sel = executeQuery(query);

        ArrayList<Tour> resultTours = makeTourList(sel);

        return resultTours;
    }

    public Tour getTourById(int id) throws Exception {
        DBconnection = new DatabaseConnection();
        String query = "SELECT * FROM tours WHERE id=" + id;
        System.out.println(query);
        ArrayList<String> sel = null;
        try {
            sel = DBconnection.executeQuery(query);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        }

        ArrayList<Tour> resultTours = new ArrayList<Tour>();
        for(int i = 0; i < sel.size(); i+=10) {
            Tour tour = new Tour(Integer.parseInt(sel.get(i)), sel.get(i+1), Double.parseDouble(sel.get(i+2)), null, null, sel.get(i+5), null, sel.get(i+6), null , null, Integer.parseInt(sel.get(i+7)), sel.get(i+8));
            resultTours.add(tour);
        }

        return resultTours.get(0);

    }



    public ArrayList<Tour> getToursInCategory(String category) throws Exception {
        DBconnection = new DatabaseConnection();
        String query = "SELECT id FROM categories WHERE name='" + category + "'";
        System.out.println(query);
        ArrayList<String> sel = null;
        try {
            sel = DBconnection.executeQuery(query);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        query = "SELECT * FROM tours WHERE category=" + sel.get(0);
        System.out.println(query);
        try {
            sel = DBconnection.executeQuery(query);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        }

        ArrayList<Tour> resultTours = new ArrayList<Tour>();
        for(int i = 0; i < sel.size(); i+=10) {
            Tour tour = new Tour(Integer.parseInt(sel.get(i)), sel.get(i+1), Double.parseDouble(sel.get(i+2)), null, null, sel.get(i+5), null, category, null , null, Integer.parseInt(sel.get(i+7)), sel.get(i+8));
            resultTours.add(tour);
        }

        return resultTours;

    }

    //Virkar
    public ArrayList<Tour> getToursByName(String name) throws Exception {
        String query = "SELECT * FROM tours WHERE name='" + name + "'";
        System.out.println(query);
        ArrayList<String> sel = executeQuery(query);

        ArrayList<Tour> resultTours = makeTourList(sel);

        return resultTours;

    }
    //Virkar
    public ArrayList<Tour> getToursByLocation(String location) throws Exception {
        String query = "SELECT * FROM tours WHERE location='" + location + "'";
        ArrayList<String> sel = executeQuery(query);

        ArrayList<Tour> resultTours = makeTourList(sel);

        return resultTours;
    }

    //Virkar
    public ArrayList<Tour> getToursByDate(Date startDate, Date endDate) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String query = "SELECT * FROM tours WHERE date Between '" + dateFormat.format(startDate) + "' AND '" + dateFormat.format(endDate) + "'";
        ArrayList<String> sel = executeQuery(query);

        ArrayList<Tour> resultTours = makeTourList(sel);

        return resultTours;
    }

    //Virkar
    public ArrayList<Tour> getToursByPrice(int minPrice, int maxPrice) throws Exception {
        String query = "SELECT * FROM tours WHERE price Between '" + minPrice + "' AND '" + maxPrice + "'";
        ArrayList<String> sel = executeQuery(query);

        ArrayList<Tour> resultTours = makeTourList(sel);

        return resultTours;
    }

    //Virkar
    //Skilar 5 tours sem byrja á eftir tour sem kemur inn í aðferðina
    public ArrayList<Tour> getTourRecomendations(Tour prevTour) throws Exception {
        String query = "SELECT * FROM tours WHERE date > '" + prevTour.getTourDate() + "' LIMIT 5";
        System.out.println(query);

        ArrayList<String> sel = executeQuery(query);

        ArrayList<Tour> resultTours = makeTourList(sel);

        return resultTours;
    }

    private ArrayList<String> executeQuery(String query) throws Exception {
        DBconnection = new DatabaseConnection();
        ArrayList<String> sel = null;
        try {
            sel = DBconnection.executeQuery(query);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        }

        return sel;
    }

    private ArrayList<Tour> makeTourList(ArrayList<String> sel) throws Exception {
        ArrayList<Tour> resultTours = new ArrayList<Tour>();
        for(int i = 0; i < sel.size(); i+=10) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String dateString = sel.get(i+3);
            Date tourDate = dateFormat.parse(dateString);

            //Vantar get á bookings og reviews þegar þær aðferðir verða ready
            Tour tour = new Tour(
                    Integer.parseInt(sel.get(i)),
                    sel.get(i+1),
                    Double.parseDouble(sel.get(i+2)),
                    tourDate,
                    sel.get(i+4),
                    sel.get(i+5),
                    sel.get(i+6),
                    sel.get(i+7),
                    null ,
                    null,
                    Integer.parseInt(sel.get(i+8)),
                    sel.get(i+9)
            );
            resultTours.add(tour);
        }

        return resultTours;
    }
}
