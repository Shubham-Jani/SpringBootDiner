package jani.food.diner.web.bootstrap;


import jani.food.diner.core.model.Dish;
import jani.food.diner.core.model.DishType;
import jani.food.diner.core.service.DishService;
import jani.food.diner.core.service.DishTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final DishTypeService dishTypeService;
    private final DishService dishService;

    public DataLoader(DishTypeService dishTypeService, DishService dishService) {
        this.dishTypeService = dishTypeService;
        this.dishService = dishService;
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
