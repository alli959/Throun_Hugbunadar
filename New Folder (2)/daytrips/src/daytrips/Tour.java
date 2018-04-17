import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Tour {

    private int tourId;
    private String tourName;
    private double tourPrice;
    private String tourDate;
    private String tourLocation;
    private String tourHost;
    private String tourGuide;
    private String tourCategory;
    private List<User> tourBookings;
    private List<Review> tourReviews;
    private int tourMaxPeople;
    private String tourInfo;

    //Constructor
    public Tour(int tourId, String tourName, double tourPrice, Date tourDate, String tourLocation, String tourHost, String tourGuide, String tourCategory, List<User> tourBookings, List<Review> tourReviews, int tourMaxPeople, String tourInfo) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.tourPrice = tourPrice;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.tourDate = dateFormat.format(tourDate);
        this.tourLocation = tourLocation;
        this.tourHost = tourHost;
        this.tourGuide = tourGuide;
        this.tourCategory = tourCategory;
        this.tourBookings = tourBookings;
        this.tourReviews = tourReviews;
        this.tourMaxPeople = tourMaxPeople;
        this.tourInfo = tourInfo;
    }

    //getter & setters
    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(double tourPrice) {
        this.tourPrice = tourPrice;
    }

    public String getTourDate() {
        return tourDate;
    }

    public void setTourDate(Date tourDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.tourDate = dateFormat.format(tourDate);
    }

    public String getTourLocation() {
        return tourLocation;
    }

    public void setTourLocation(String tourLocation) {
        this.tourLocation = tourLocation;
    }

    public String getTourHost() {
        return tourHost;
    }

    public void setTourHost(String tourHost) {
        this.tourHost = tourHost;
    }

    public String getTourGuide() {
        return tourGuide;
    }

    public void setTourGuide(String tourGuide) {
        this.tourGuide = tourGuide;
    }

    public String getTourCategory() {
        return tourCategory;
    }

    public void setTourCategory(String tourCategory) {
        this.tourCategory = tourCategory;
    }

    public List<User> getTourBookings() {
        return tourBookings;
    }

    public void setTourBookings(List<User> tourBookings) {
        this.tourBookings = tourBookings;
    }

    public List<Review> getTourReviews() {
        return tourReviews;
    }

    public void setTourReviews(List<Review> tourReviews) {
        this.tourReviews = tourReviews;
    }

    public int getTourMaxPeople() {
        return tourMaxPeople;
    }

    public void setTourMaxPeople(int tourMaxPeople) {
        this.tourMaxPeople = tourMaxPeople;
    }

    public String getTourInfo() {
        return tourInfo;
    }

    public void setTourInfo(String tourInfo) {
        this.tourInfo = tourInfo;
    }

    public boolean isFull() {
        return tourBookings.size() == tourMaxPeople;
    }
}
