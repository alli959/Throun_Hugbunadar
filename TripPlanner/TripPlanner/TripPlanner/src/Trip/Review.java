package Trip;

import java.util.List;

public class Review {
    private int reviewId;
    private String reviewText;
    private Tour reviewTour;
    private String reviewAuthor;
    private int numLikes;
    private List<User> userLikes;

    public Review(int reviewId, String reviewText, Tour reviewTour, String reviewAuthor, int numLikes, List<User> userLikes) {
        this.reviewId = reviewId;
        this.reviewText = reviewText;
        this.reviewTour = reviewTour;
        this.reviewAuthor = reviewAuthor;
        this.numLikes = numLikes;
        this.userLikes = userLikes;
    }

    //getters & setters
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Tour getReviewTour() {
        return reviewTour;
    }

    public void setReviewTour(Tour reviewTour) {
        this.reviewTour = reviewTour;
    }

    public String getReviewAuthor() {
        return reviewAuthor;
    }

    public void setReviewAuthor(String reviewAuthor) {
        this.reviewAuthor = reviewAuthor;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public List<User> getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(List<User> userLikes) {
        this.userLikes = userLikes;
    }
}
