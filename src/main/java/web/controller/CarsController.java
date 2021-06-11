package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.models.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) String count, Model model) {
        model.addAttribute("cars", carService.getNumberOfCars(count));
        return "/cars";
    }
}
