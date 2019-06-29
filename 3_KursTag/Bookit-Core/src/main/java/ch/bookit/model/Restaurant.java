package ch.bookit.model;

import java.util.List;

public interface Restaurant {

    public void add(RestaurantDbo restaurant);

    public void delete(RestaurantDbo restaurant);

    public List<RestaurantDbo> getAll();

    public void init();


}
