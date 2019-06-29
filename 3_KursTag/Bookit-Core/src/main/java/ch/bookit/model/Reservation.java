package ch.bookit.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {

    private ClientDbo client ;

    private Restaurant restaurant ;

    private  int persons ;

    private LocalDate date;

    private LocalTime time ;


    public Reservation(ClientDbo client, Restaurant restaurant, int persons, LocalDate date, LocalTime time) {
        this.client = client;
        this.restaurant = restaurant;
        this.persons = persons;
        this.date = date;
        this.time = time;
    }

    public ClientDbo getClient() {
        return client;
    }

    public void setClient(ClientDbo client) {
        this.client = client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
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

    @Override
    public String toString() {
        return "Reservation{" +
                "client=" + client +
                ", restaurant=" + restaurant +
                ", persons=" + persons +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
