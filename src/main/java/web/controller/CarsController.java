package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDAO carDAO;

    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("")
    public  String show(@RequestParam(value = "count", required = false) Long count, Model model) {
        model.addAttribute("cars", carDAO.show(count));
        return "indexCar";
    }

}
