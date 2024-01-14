package jani.food.diner.core.service.map;

import jani.food.diner.core.model.Dish;
import jani.food.diner.core.service.DishService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DishMapService extends AbstractMapService<Dish,Long> implements DishService {
    @Override
    public Dish findByName(String name) {
        Optional<Dish> dishResult = map.values()
                .stream()
                .filter(obj -> obj.getName().equals(name))
                .findFirst();
        return dishResult.orElse(null);
    }
}
