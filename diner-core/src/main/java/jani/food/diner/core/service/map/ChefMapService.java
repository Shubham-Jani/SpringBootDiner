package jani.food.diner.core.service.map;

import jani.food.diner.core.model.Chef;
import jani.food.diner.core.service.ChefService;
import org.springframework.stereotype.Service;

@Service
public class ChefMapService extends AbstractMapService<Chef,Long> implements ChefService {

}
