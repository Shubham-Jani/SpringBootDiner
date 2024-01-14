package jani.food.diner.core.service.map;

import jani.food.diner.core.model.DishType;
import jani.food.diner.core.service.DishTypeService;
import org.springframework.stereotype.Service;

@Service
public class DishTypeMapService extends AbstractMapService<DishType,Long> implements DishTypeService {
}
