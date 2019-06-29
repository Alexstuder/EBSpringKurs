package ch.bookit.controller;

import ch.bookit.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping(path="/")
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    //@Value("${welcome.restaurant}")
    Restaurant restaurants = new RestaurantImpl();

    private Client client = new ClientImpl();

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @GetMapping("/")
    public String home(Model model) {

        // Inits restaurants and get the List
        restaurants.getAll();

        model.addAttribute("restaurants",restaurants);
        model.addAttribute("client",client);
        model.addAttribute("message", message);
        //model.addAttribute("tasks", tasks);
        System.out.println(restaurants.toString());
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

        model.addAttribute("message", "WebSite !");

        return "reserve"; //view
    }

    // /hello?name=kotlin
}
