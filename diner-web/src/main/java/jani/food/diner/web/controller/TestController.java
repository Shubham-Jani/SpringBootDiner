package jani.food.diner.web.controller;

import jani.food.diner.core.service.DishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TestController {
    private final DishService dishService;

    public TestController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("dishes", dishService.findAll());
        System.out.println(dishService.findAll().size());
        return "index";
    }
}
