package ch.bookit.controller;

import ch.bookit.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
//@RequestMapping(path="/")
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    //@Value("${welcome.restaurant}")
    RestaurantListImpl restaurantList = new RestaurantListImpl();

    ReservationDto reservation ;


    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @GetMapping("/")
    public String home(Model model) {

        // Inits restaurants and get the List
        restaurantList.readRestaurantList();


        //model.addAttribute("message", message);
        //model.addAttribute("tasks", tasks);
        //System.out.println(restaurantList.toString());
        //System.out.println(model.toString());

       return "home"; //view
        //ModelAndView modelAndView = new ModelAndView(model);
        //final Map<String, Object> model2 = new HashMap<>();
        //model2.put("message", message);

       // return new ModelAndView("/welcome", model2) ;//view
    }

    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "")
                    String name, Model model) {

        model.addAttribute("message", "hello");

        return "welcome"; //view
    }

    @GetMapping("/reserve")
    public String reserve(Model model) {

        // Inits restaurants and get the List
        restaurantList.readRestaurantList();


        ReservationDto reservationDto = new ReservationDto();
        reservationDto.setClient(new ClientDto());
        reservationDto.setRestaurantNameList(restaurantList.getRestaurantNames());
        reservationDto.setValueRestaurant(0);

        model.addAttribute("reservationDto", reservationDto );

        return "reserve"; //view
    }
    @PostMapping("/reserve")
    public ModelAndView reserveSubmit(@ModelAttribute ClientDto clientDbo, @ModelAttribute Integer value) {



        final Map<String,Object> model =
                new HashMap<>();
        model.put("clientDbo",clientDbo);
        model.put("restaurantList", restaurantList.getRestaurant(value));

        System.out.println(clientDbo.toString());


        return new ModelAndView("reserveConfirm",model); //view
    }

}
