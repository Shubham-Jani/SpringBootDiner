package jani.food.diner.core.service;

import jani.food.diner.core.model.Dish;

public interface DishService extends CrudService<Dish,Long> {
    public Dish findByName(String name);
}
