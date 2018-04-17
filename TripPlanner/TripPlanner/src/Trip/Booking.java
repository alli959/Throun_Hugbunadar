package Trip;

public class Booking {
    private int id;
    private Tour tour;
    private String name;
    private String email;
    private boolean hotelPickup;
    private Location pickupLocation;

    public Booking(int id, Tour tour, String name, String email, boolean hotelPickup, Location pickupLocation) {
        this.id = id;
        this.tour = tour;
        this.name = name;
        this.email = email;
        this.hotelPickup = hotelPickup;
        this.pickupLocation = pickupLocation;
    }

    //getter & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHotelPickup() {
        return hotelPickup;
    }

    public void setHotelPickup(boolean hotelPickup) {
        this.hotelPickup = hotelPickup;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    private void sendConfirmation() {

    }
}
