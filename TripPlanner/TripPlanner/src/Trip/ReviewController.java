package Trip;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReviewController {
    private DatabaseConnection DBconnection;

    public ReviewController() {

    }

    public void addReview(Review review, Tour tour) {
        DBconnection = new DatabaseConnection();
        if(review.getReviewId() > 0) {
            try {
                String query = "INSERT INTO reviews (reviewText, tour, author, likes) VALUES ('" + review.getReviewText() + "', '" +  tour.getTourId() + "', '" + review.getReviewAuthor() + "', '" + review.getNumLikes() + "')";
                DBconnection.executeUpdate(query);
             } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            try {
                throw new Exception("Username must be set");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void removeReview(Review review, Tour tour) {
        try {
            DBconnection = new DatabaseConnection();
            String query = "DELETE FROM reviews WHERE tour=" + tour.getTourId();
            DBconnection.executeUpdate(query);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    public ArrayList<Review> getReviewsForTour(Tour tour) throws Exception {
        DatabaseConnection DBcon = new DatabaseConnection();
        String query = "SELECT * FROM reviews WHERE tour=" + tour.getTourId();
        ArrayList<String> sel = null;
        try {
            sel = DBcon.executeQuery(query);
            System.out.println(sel);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        ArrayList<Review> reviewsList= new ArrayList<Review>();
        for(int i = 0; i <= sel.size()-1; i=i+5) {
            Review rw = new Review(Integer.parseInt(sel.get(i)), sel.get(i+1), tour, sel.get(i+3), Integer.parseInt(sel.get(i+4)), null);
            reviewsList.add(rw);
        }
        return reviewsList;
    }

    public void likeReview(Review review) {
        DatabaseConnection DBcon = new DatabaseConnection();
        review.setNumLikes(review.getNumLikes()+1);
        String query = "UPDATE reviews SET likes = likes+1 where author=" + "'" + review.getReviewAuthor() + "'" + "AND tour= " + review.getReviewTour().getTourId();
        try {
            DBcon.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
