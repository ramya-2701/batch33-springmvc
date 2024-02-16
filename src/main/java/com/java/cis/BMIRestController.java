package com.java.cis;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIRestController {
    @PostMapping("/bmirest")
    public String calculateBMI(@RequestParam("height") double height, @RequestParam("weight") double weight) {
        double bmi = Math.round((weight / (height * height) * 703)*100)/100.0;
        String jsonResponse = "{calculated bmi for height "+height+" weight "+weight+" is:" + bmi + "}";

        return jsonResponse;
    }
}