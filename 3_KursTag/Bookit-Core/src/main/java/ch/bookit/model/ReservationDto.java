package ch.bookit.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationDto {

    private ClientDto client ;

    private RestaurantDto restaurantDto ;

    private List<String> restaurantNameList;

    private int valueRestaurant;

    private  int persons ;

    private LocalDate date;

    private LocalTime time ;


    public ReservationDto() {
    }
        public ReservationDto(ClientDto client, RestaurantDto restaurantDto, int persons, LocalDate date, LocalTime time) {
        this.client = client;
        this.restaurantDto = restaurantDto;
        this.restaurantNameList = new ArrayList<String>();
        this.persons = persons;
        this.date = date;
        this.time = time;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public RestaurantDto getRestaurant() {
        return restaurantDto;
    }

    public void setRestaurant(RestaurantDto restaurantDto) {
        this.restaurantDto = restaurantDto;
    }

    public int getValueRestaurant() {
        return valueRestaurant;
    }

    public void setValueRestaurant(int valueRestaurant) {
        this.valueRestaurant = valueRestaurant;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public List<String> getRestaurantNameList() {
        return restaurantNameList;
    }

    public void setRestaurantNameList(List<String> restaurantNameList) {
        this.restaurantNameList = restaurantNameList;
    }

    @Override
    public String toString() {
        return "ReservationDto{" +
                "client=" + client +
                ", restaurant=" + restaurantDto +
                ", persons=" + persons +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
