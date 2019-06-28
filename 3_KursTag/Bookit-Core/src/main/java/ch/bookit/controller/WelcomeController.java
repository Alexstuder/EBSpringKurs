package ch.bookit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping(path="/")
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @GetMapping("/")
    public String welcome(Model model) {
        System.out.println("Welcome");
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        System.out.println(model.toString());
        System.out.println("Welcome2");

       return "welcome"; //view
        //ModelAndView modelAndView = new ModelAndView(model);
        //final Map<String, Object> model2 = new HashMap<>();
        //model2.put("message", message);

       // return new ModelAndView("/welcome", model2) ;//view
    }

    // /hello?name=kotlin
    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "")
                    String name, Model model) {

        model.addAttribute("message", "hello");

        return "welcome"; //view
    }

}
