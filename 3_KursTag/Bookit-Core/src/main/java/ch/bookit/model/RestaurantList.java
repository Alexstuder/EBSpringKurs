package ch.bookit.model;

import java.util.List;

public interface RestaurantList {


    public void addRestaurant(RestaurantDto restaurantDto);

    public void getAllRestaurants();

    public void readRestaurantList();

    public RestaurantDto getRestaurant(Integer value);

    public List<String> getRestaurantNames();
}
