package Trip;

public class Location {
    private String city;
    private int areaCode;
    private String adress;

    public Location(String city, int areaCode, String adress) {
        this.city = city;
        this.areaCode = areaCode;
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public String getAdress() {
        return adress;
    }
}
