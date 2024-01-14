package jani.food.diner.core.service.map;

import jani.food.diner.core.model.Order;
import jani.food.diner.core.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderMapService extends AbstractMapService<Order,Long> implements OrderService {
}
