package Trip;

import java.util.List;

public class User {
    private int userId;
    private String userMail;
    private String userPhone;
    private String userName;
    private List<Booking> userBookings;

    public User(int userId, String userMail, String userPhone, String userName, List<Booking> userBookings) {
        this.userId = userId;
        this.userMail = userMail;
        this.userPhone = userPhone;
        this.userName = userName;
        this.userBookings = userBookings;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Booking> getUserBookings() {
        return userBookings;
    }

    public void setUserBookings(List<Booking> userBookings) {
        this.userBookings = userBookings;
    }
}
