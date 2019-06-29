package ch.bookit.model;

public class RestaurantDbo {

    private String restaurantName ;
    private String street ;
    private String town ;


    public RestaurantDbo(String restaurantName, String street, String town) {
        this.restaurantName = restaurantName;
        this.street = street;
        this.town = town;
    }



    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
