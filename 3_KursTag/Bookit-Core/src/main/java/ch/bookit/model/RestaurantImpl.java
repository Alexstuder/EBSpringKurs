package ch.bookit.model;


import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantImpl implements Restaurant {


    List<RestaurantDbo> restaurants = new ArrayList<RestaurantDbo>();


    @Override
    public void add(RestaurantDbo restaurant) {

    }

    @Override
    public void delete(RestaurantDbo restaurant) {

    }

    @Override
    public List<RestaurantDbo> getAll() {
        //TODO Alex : Replace Init Method with Read JSON File
        this.init();
        return restaurants;
    }


    public void init(){
        List<RestaurantDbo> restaurants = new ArrayList<RestaurantDbo>();
        RestaurantDbo restaurant1 = new RestaurantDbo("ChinasBest","BruceLeeStreet","Peking");
        RestaurantDbo restaurant2 = new RestaurantDbo("Viva Uxmal","SanDiegoStreet","Tulum");

        this.restaurants.add(restaurant1);
        this.restaurants.add(restaurant2);

    }

    @Override
    public String toString() {
        String result = restaurants.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining("\n"));
                //.collect(Collectors.joining("\n","{","}"));
                ;



        return result ;
    }
}
