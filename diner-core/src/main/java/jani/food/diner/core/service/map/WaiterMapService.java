package jani.food.diner.core.service.map;

import jani.food.diner.core.model.Waiter;
import jani.food.diner.core.service.WaiterService;
import org.springframework.stereotype.Service;

@Service
public class WaiterMapService extends AbstractMapService<Waiter,Long> implements WaiterService {
}
