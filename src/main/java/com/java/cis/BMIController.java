package com.java.cis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BMIController {

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String input() {
        return "input";
    }
    @RequestMapping(value = "/bmi", method = RequestMethod.POST)
    public String result(@RequestParam("height") double heightInInches,
                               @RequestParam("weight") double weightInPounds,
                               Model model) {
        double bmi = Math.round((weightInPounds / (heightInInches * heightInInches) * 703)*100)/100.0;

        model.addAttribute("height",heightInInches);
        model.addAttribute("weight",weightInPounds);
        model.addAttribute("bmi", bmi);
        return "result";
    }
}


// Dispatcher Servlet
// View Resolver
// mvc


