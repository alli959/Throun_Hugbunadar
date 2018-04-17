import java.sql.Array;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String ds = "2018-02-16 14:30";
        Date date = dateFormat.parse(ds);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Review> reviews = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        User guide = new User(2, "ids", "7439", "Guide", bookings);
        Tour tour = new Tour(
                1,
                "Kajak ferð 2",
                1000,
                date,
                "Vatnajokuill 34",
                "Kjakferðir",
                "Jóhann",
                "Jokull",
                users,
                reviews,
                10,
                "2 klst kajak ferð"
                );
        Booking booking = new Booking(1, tour, "Ingi", "ingi@gmail.com", true, null);



        TourController tc = new TourController();
        //tc.addTour(tour);
        String startDate = "2018-02-16 14:00";
        String endDate = "2018-02-16 15:00";
        Date sd = new Date(2018-1900, 02, 16, 14, 00);
        Date ed = new Date(2018-1900, 02, 16, 15, 00);
        System.out.println(sd);
        ArrayList<Tour> list = tc.getToursByDate(sd, ed);
        //ArrayList<Tour> list2 = tc.getTourRecomendations(list.get(0));
        System.out.println(list.get(0).getTourName());
        //Review rw = rc.getReviewsForTour();
    }
}
