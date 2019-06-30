package ch.bookit.model;

import java.util.ArrayList;
import java.util.List;

public class RestaurantListImpl implements RestaurantList{

    List<RestaurantDto> restaurantDtoList = new ArrayList<RestaurantDto>();


    @Override
    public void addRestaurant(RestaurantDto restaurantDto) {
        this.restaurantDtoList.add(restaurantDto);
    }

    @Override
    public void getAllRestaurants() {

    }

    @Override
    public void  readRestaurantList() {


        //TODO : Alex : Replace static Test wieht JSON FILE reader
        List<RestaurantDto> restaurantDtoList = new ArrayList<RestaurantDto>();

        this.restaurantDtoList.add(new RestaurantDto("BestChina","Bruce Lee","Peking"));
        this.restaurantDtoList.add(new RestaurantDto("Vivia MExoci","Speedy Gonzuales","Mexico City"));


    }

    @Override
    public RestaurantDto getRestaurant(Integer value) {
        return this.restaurantDtoList.get(value);
    }

    @Override
    public List<String> getRestaurantNames() {

        List<String> nameList = new ArrayList<String>();

        for (int i = 0; i < restaurantDtoList.size(); i++) {
             nameList.add(this.restaurantDtoList.get(i).getRestaurantName());

        }

        return nameList;
    }
}
